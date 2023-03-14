package com.caixa.rentcar.domain.spi.ports;

import com.caixa.rentcar.domain.model.DomainClientBonusModel;

import java.util.List;


public interface DomainClientBonusRepositoryPort {
    void addBonus(DomainClientBonusModel domainClientBonusModel);

    List<DomainClientBonusModel> findClientBonus(String clientDni);

}
