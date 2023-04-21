package com.caixa.rentcar.infrastructure.h2.repository;

import com.caixa.rentcar.infrastructure.h2.entity.RentCarOrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface InfraRentCarOrderDetailRepository extends JpaRepository<RentCarOrderDetailEntity, Long> {

     @Query(nativeQuery = true, value ="SELECT ro.*, CONCAT(c.name,' ',c.surname) as client_fullname, CONCAT(ca.make, ' ',ca.model,' ',ca.year) as car_detail FROM rentcar_orders ro "+
                                       "inner join clients c on c.dni=ro.client_dni "+
                                       "inner join cars ca on ca.plate=ro.car_plate "+
                                       "where ro.id=?1")
     RentCarOrderDetailEntity findRentCarOrder(String rentcarId);
}