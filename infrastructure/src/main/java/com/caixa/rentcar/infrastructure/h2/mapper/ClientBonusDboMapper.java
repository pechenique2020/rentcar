package com.caixa.rentcar.infrastructure.h2.mapper;

import com.caixa.rentcar.domain.model.DomainClientBonusModel;
import com.caixa.rentcar.infrastructure.h2.entity.ClientBonusEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientBonusDboMapper {

    ClientBonusEntity toDbo(DomainClientBonusModel domain);
    @InheritInverseConfiguration
    List<DomainClientBonusModel> toDomainList(List<ClientBonusEntity> entityList);
}