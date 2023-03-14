package com.caixa.rentcar.infrastructure.h2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ClientLoyaltyEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "loyalty")
    private int loyalty;
}