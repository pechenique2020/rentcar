package com.caixa.rentcar.infrastructure.h2.mapper;

import com.caixa.rentcar.domain.model.DomainClientBonusModel;
import com.caixa.rentcar.domain.model.DomainClientBonusModel.DomainClientBonusModelBuilder;
import com.caixa.rentcar.infrastructure.h2.entity.ClientBonusEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-14T07:50:05+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class ClientBonusDboMapperImpl implements ClientBonusDboMapper {

    @Override
    public ClientBonusEntity toDbo(DomainClientBonusModel domain) {
        if ( domain == null ) {
            return null;
        }

        ClientBonusEntity clientBonusEntity = new ClientBonusEntity();

        clientBonusEntity.setId( domain.getId() );
        clientBonusEntity.setDni( domain.getDni() );
        clientBonusEntity.setCarPlate( domain.getCarPlate() );
        clientBonusEntity.setRentcarId( domain.getRentcarId() );
        clientBonusEntity.setPoints( domain.getPoints() );

        return clientBonusEntity;
    }

    @Override
    public List<DomainClientBonusModel> toDomainList(List<ClientBonusEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DomainClientBonusModel> list = new ArrayList<DomainClientBonusModel>( entityList.size() );
        for ( ClientBonusEntity clientBonusEntity : entityList ) {
            list.add( clientBonusEntityToDomainClientBonusModel( clientBonusEntity ) );
        }

        return list;
    }

    protected DomainClientBonusModel clientBonusEntityToDomainClientBonusModel(ClientBonusEntity clientBonusEntity) {
        if ( clientBonusEntity == null ) {
            return null;
        }

        DomainClientBonusModelBuilder domainClientBonusModel = DomainClientBonusModel.builder();

        domainClientBonusModel.id( clientBonusEntity.getId() );
        domainClientBonusModel.dni( clientBonusEntity.getDni() );
        domainClientBonusModel.carPlate( clientBonusEntity.getCarPlate() );
        if ( clientBonusEntity.getRentcarId() != null ) {
            domainClientBonusModel.rentcarId( clientBonusEntity.getRentcarId() );
        }
        domainClientBonusModel.points( clientBonusEntity.getPoints() );

        return domainClientBonusModel.build();
    }
}
