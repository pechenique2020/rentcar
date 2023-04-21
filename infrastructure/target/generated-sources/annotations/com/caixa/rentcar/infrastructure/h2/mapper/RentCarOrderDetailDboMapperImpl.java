package com.caixa.rentcar.infrastructure.h2.mapper;

import com.caixa.rentcar.domain.model.DomainRentCarOrderDetailModel;
import com.caixa.rentcar.domain.model.DomainRentCarOrderDetailModel.DomainRentCarOrderDetailModelBuilder;
import com.caixa.rentcar.infrastructure.h2.entity.RentCarOrderDetailEntity;
import java.time.LocalDateTime;
import java.time.ZoneId;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-23T23:09:10+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class RentCarOrderDetailDboMapperImpl implements RentCarOrderDetailDboMapper {

    @Override
    public DomainRentCarOrderDetailModel toDomain(RentCarOrderDetailEntity entity) {
        if ( entity == null ) {
            return null;
        }

        DomainRentCarOrderDetailModelBuilder domainRentCarOrderDetailModel = DomainRentCarOrderDetailModel.builder();

        domainRentCarOrderDetailModel.id( entity.getId() );
        domainRentCarOrderDetailModel.clientDni( entity.getClientDni() );
        domainRentCarOrderDetailModel.clientFullname( entity.getClientFullname() );
        domainRentCarOrderDetailModel.carPlate( entity.getCarPlate() );
        domainRentCarOrderDetailModel.carDetail( entity.getCarDetail() );
        domainRentCarOrderDetailModel.startDate( entity.getStartDate() );
        domainRentCarOrderDetailModel.endDate( entity.getEndDate() );
        domainRentCarOrderDetailModel.returnDate( entity.getReturnDate() );
        domainRentCarOrderDetailModel.price( entity.getPrice() );
        domainRentCarOrderDetailModel.status( entity.getStatus() );
        if ( entity.getCreatedOn() != null ) {
            domainRentCarOrderDetailModel.createdOn( LocalDateTime.ofInstant( entity.getCreatedOn().toInstant(), ZoneId.of( "UTC" ) ) );
        }

        return domainRentCarOrderDetailModel.build();
    }
}
