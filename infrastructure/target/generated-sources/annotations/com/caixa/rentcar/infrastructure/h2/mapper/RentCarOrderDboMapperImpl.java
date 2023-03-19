package com.caixa.rentcar.infrastructure.h2.mapper;

import com.caixa.rentcar.domain.model.DomainRentCarOrderDetailModel;
import com.caixa.rentcar.domain.model.DomainRentCarOrderDetailModel.DomainRentCarOrderDetailModelBuilder;
import com.caixa.rentcar.domain.model.DomainRentCarOrderModel;
import com.caixa.rentcar.domain.model.DomainRentCarOrderModel.DomainRentCarOrderModelBuilder;
import com.caixa.rentcar.infrastructure.h2.entity.RentCarOrderEntity;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-19T09:44:26+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class RentCarOrderDboMapperImpl implements RentCarOrderDboMapper {

    @Override
    public RentCarOrderEntity toDbo(DomainRentCarOrderModel domain) {
        if ( domain == null ) {
            return null;
        }

        RentCarOrderEntity rentCarOrderEntity = new RentCarOrderEntity();

        rentCarOrderEntity.setId( domain.getId() );
        rentCarOrderEntity.setClientDni( domain.getClientDni() );
        rentCarOrderEntity.setCarPlate( domain.getCarPlate() );
        if ( domain.getStartDate() != null ) {
            rentCarOrderEntity.setStartDate( new Date( domain.getStartDate().getTime() ) );
        }
        if ( domain.getEndDate() != null ) {
            rentCarOrderEntity.setEndDate( new Date( domain.getEndDate().getTime() ) );
        }
        if ( domain.getReturnDate() != null ) {
            rentCarOrderEntity.setReturnDate( new Date( domain.getReturnDate().getTime() ) );
        }
        rentCarOrderEntity.setPrice( domain.getPrice() );
        rentCarOrderEntity.setStatus( domain.getStatus() );
        rentCarOrderEntity.setCreatedOn( domain.getCreatedOn() );

        return rentCarOrderEntity;
    }

    @Override
    public DomainRentCarOrderDetailModel toDomainInfo(RentCarOrderEntity entity) {
        if ( entity == null ) {
            return null;
        }

        DomainRentCarOrderDetailModelBuilder domainRentCarOrderDetailModel = DomainRentCarOrderDetailModel.builder();

        domainRentCarOrderDetailModel.id( entity.getId() );
        domainRentCarOrderDetailModel.clientDni( entity.getClientDni() );
        domainRentCarOrderDetailModel.carPlate( entity.getCarPlate() );
        domainRentCarOrderDetailModel.startDate( entity.getStartDate() );
        domainRentCarOrderDetailModel.endDate( entity.getEndDate() );
        domainRentCarOrderDetailModel.returnDate( entity.getReturnDate() );
        domainRentCarOrderDetailModel.price( entity.getPrice() );
        domainRentCarOrderDetailModel.status( entity.getStatus() );
        domainRentCarOrderDetailModel.createdOn( entity.getCreatedOn() );

        return domainRentCarOrderDetailModel.build();
    }

    @Override
    public DomainRentCarOrderModel toDomain(RentCarOrderEntity entity) {
        if ( entity == null ) {
            return null;
        }

        DomainRentCarOrderModelBuilder domainRentCarOrderModel = DomainRentCarOrderModel.builder();

        domainRentCarOrderModel.id( entity.getId() );
        domainRentCarOrderModel.clientDni( entity.getClientDni() );
        domainRentCarOrderModel.carPlate( entity.getCarPlate() );
        domainRentCarOrderModel.startDate( entity.getStartDate() );
        domainRentCarOrderModel.endDate( entity.getEndDate() );
        domainRentCarOrderModel.returnDate( entity.getReturnDate() );
        domainRentCarOrderModel.price( entity.getPrice() );
        domainRentCarOrderModel.status( entity.getStatus() );
        domainRentCarOrderModel.createdOn( entity.getCreatedOn() );

        return domainRentCarOrderModel.build();
    }

    @Override
    public List<RentCarOrderEntity> toListDbo(List<DomainRentCarOrderModel> domain) {
        if ( domain == null ) {
            return null;
        }

        List<RentCarOrderEntity> list = new ArrayList<RentCarOrderEntity>( domain.size() );
        for ( DomainRentCarOrderModel domainRentCarOrderModel : domain ) {
            list.add( toDbo( domainRentCarOrderModel ) );
        }

        return list;
    }

    @Override
    public List<DomainRentCarOrderModel> toDomainList(List<RentCarOrderEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DomainRentCarOrderModel> list = new ArrayList<DomainRentCarOrderModel>( entityList.size() );
        for ( RentCarOrderEntity rentCarOrderEntity : entityList ) {
            list.add( toDomain( rentCarOrderEntity ) );
        }

        return list;
    }
}
