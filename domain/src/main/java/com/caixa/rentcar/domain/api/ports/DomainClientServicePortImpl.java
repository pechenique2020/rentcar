package com.caixa.rentcar.domain.api.ports;

import com.caixa.rentcar.domain.model.*;
import com.caixa.rentcar.domain.shared.constants.DomainMessages;
import com.caixa.rentcar.domain.shared.exceptions.DomainNotFoundException;
import com.caixa.rentcar.domain.spi.ports.DomainClientBonusRepositoryPort;
import com.caixa.rentcar.domain.spi.ports.DomainClientRepositoryPort;
import com.caixa.rentcar.domain.spi.ports.DomainRentCarOrderClientRepositoryPort;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class DomainClientServicePortImpl implements DomainClientServicePort {

    private final DomainClientRepositoryPort domainClientRepositoryPort;
    private final DomainClientBonusRepositoryPort domainClientBonusRepositoryPort;
    private final DomainRentCarOrderClientRepositoryPort domainRentCarOrderClientRepositoryPort;

    @Override
    public DomainClientModel findClientByDni(String clientDni){
        DomainClientModel domainClientModel = domainClientRepositoryPort.findClientByDni(clientDni);
        if (domainClientModel!=null){
            List<DomainClientBonusModel> clientBonus = domainClientBonusRepositoryPort.findClientBonus(clientDni);
            domainClientModel.setLoyalty(sumPoints(clientBonus));
            List<DomainRentCarOrderClientModel> domainRentCarOrderClientModelList = domainRentCarOrderClientRepositoryPort.findRentCarOrderByClientDni(clientDni);
            domainClientModel.setOrderHistory(!domainRentCarOrderClientModelList.isEmpty() ? domainRentCarOrderClientModelList : new ArrayList<>());
            return domainClientModel;
        }else{
            throw new DomainNotFoundException(DomainMessages.KEY_NOT_FOUND);
        }
    }

    @Override
    public DomainApiResponseModel createClient(List<DomainClientModel> clientList){
        List<DomainClientModel> domainClientModel = domainClientRepositoryPort.findClientByDniList(clientList.stream().map(c -> c.getDni()).collect(Collectors.toList()));
        if (domainClientModel.isEmpty()){
            domainClientRepositoryPort.saveClient(clientList);
            return new DomainApiResponseModel(DomainMessages.OPERATION_OK_CODE, DomainMessages.OPERATION_OK_TEXT,"Se ha creado el cliente exitosamente",null);
        }else{
            throw new DomainNotFoundException(DomainMessages.CLIENT_ALREADY_EXISTS);
        }
    }

    private int sumPoints(List<DomainClientBonusModel> clientBonus){
        return clientBonus.stream()
                .map(c -> c.getPoints())
                .mapToInt(i -> i)
                .sum();
    }
}
