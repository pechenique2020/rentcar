package com.caixa.rentcar.infrastructure.h2.repository;

import com.caixa.rentcar.infrastructure.h2.entity.ClientBonusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfraClientLoyaltyRepository extends JpaRepository<ClientBonusEntity, Long> {
    @Query(nativeQuery = true, value ="SELECT cb.* FROM client_bonus cb where cb.dni=?1")
    List<ClientBonusEntity> findClientBonus(String clientDni);
}