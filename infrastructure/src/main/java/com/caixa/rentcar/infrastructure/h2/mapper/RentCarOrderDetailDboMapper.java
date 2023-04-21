package com.caixa.rentcar.infrastructure.h2.mapper;


import com.caixa.rentcar.domain.model.DomainRentCarOrderDetailModel;
import com.caixa.rentcar.infrastructure.h2.entity.RentCarOrderDetailEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface RentCarOrderDetailDboMapper {

    @InheritInverseConfiguration
    DomainRentCarOrderDetailModel toDomain(RentCarOrderDetailEntity entity);

}