package com.caixa.rentcar.domain.api.ports;

import com.caixa.rentcar.domain.model.DomainApiResponseModel;
import com.caixa.rentcar.domain.model.DomainRentCarOrderClientModel;
import com.caixa.rentcar.domain.model.DomainRentCarOrderDetailModel;
import com.caixa.rentcar.domain.model.DomainRentCarOrderModel;

import java.text.ParseException;
import java.util.List;

public interface DomainRentCarServicePort {
    DomainRentCarOrderDetailModel findRentCarOrder(String rentcarId);

    DomainApiResponseModel createRentCarOrder(List<DomainRentCarOrderModel> domainRentCarOrderListModel);
    DomainApiResponseModel completeRentCarOrder(String carPlate, String returnDate) throws ParseException;
}
