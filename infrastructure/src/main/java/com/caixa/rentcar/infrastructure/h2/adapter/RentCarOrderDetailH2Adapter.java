package com.caixa.rentcar.infrastructure.h2.adapter;

import com.caixa.rentcar.domain.model.DomainRentCarOrderDetailModel;
import com.caixa.rentcar.domain.spi.ports.DomainRentCarOrderDetailRepositoryPort;
import com.caixa.rentcar.infrastructure.h2.mapper.RentCarOrderDetailDboMapper;
import com.caixa.rentcar.infrastructure.h2.repository.InfraRentCarOrderDetailRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class RentCarOrderDetailH2Adapter implements DomainRentCarOrderDetailRepositoryPort {
    
    InfraRentCarOrderDetailRepository rentCarOrderDetailRepository;

    RentCarOrderDetailDboMapper rentCarOrderDetailMapper;

    @Override
    public DomainRentCarOrderDetailModel findRentCarOrder(String rentcarId) {
        log.debug("findRentCarOrderByRentcarOder()");
        return rentCarOrderDetailMapper.toDomain(rentCarOrderDetailRepository.findRentCarOrder(rentcarId));
    }

}
