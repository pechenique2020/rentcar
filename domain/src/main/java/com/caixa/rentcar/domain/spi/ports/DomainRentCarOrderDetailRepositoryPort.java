package com.caixa.rentcar.domain.spi.ports;


import com.caixa.rentcar.domain.model.DomainRentCarOrderDetailModel;

public interface DomainRentCarOrderDetailRepositoryPort {

    DomainRentCarOrderDetailModel findRentCarOrder(String carPlate);

}
