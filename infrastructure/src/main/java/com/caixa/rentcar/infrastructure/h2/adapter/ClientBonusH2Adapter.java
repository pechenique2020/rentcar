package com.caixa.rentcar.infrastructure.h2.adapter;

import com.caixa.rentcar.domain.model.DomainClientBonusModel;
import com.caixa.rentcar.domain.spi.ports.DomainClientBonusRepositoryPort;
import com.caixa.rentcar.infrastructure.h2.mapper.ClientBonusDboMapper;
import com.caixa.rentcar.infrastructure.h2.repository.InfraClientBonusRepository;
import com.caixa.rentcar.infrastructure.h2.repository.InfraClientLoyaltyRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
@Slf4j
public class ClientBonusH2Adapter implements DomainClientBonusRepositoryPort {
    
    InfraClientBonusRepository clientBonusRepository;
    InfraClientLoyaltyRepository clientLoyaltyRepository;
    ClientBonusDboMapper clientBonusMapper;

    @Override
    public void addBonus(DomainClientBonusModel domainClientBonusModel) {
        log.debug("addBonus()");
        clientBonusRepository.save(clientBonusMapper.toDbo(domainClientBonusModel));
    }

    @Override
    public List<DomainClientBonusModel> findClientBonus(String clientDni) {
        log.debug("findClientBonus()");
        return clientBonusMapper.toDomainList(clientLoyaltyRepository.findClientBonus(clientDni));
    }

}
