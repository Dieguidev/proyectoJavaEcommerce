package com.dieguidev.ecommercejava.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "buys")
@Getter
@Setter
@NoArgsConstructor
public class BuysEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_buys",nullable = false)
    private Integer idBuys;

    @Column(name = "id_customer",nullable = false, length = 20)
    private String IdCustomer;

    @Column(nullable = false, columnDefinition = "DATETIME")
    private Date date;

    @Column(name = "payment_method",nullable = false,columnDefinition = "CHAR(1)")
    private String paymentMethod;

    @Column(length = 300)
    private String comment;

    @Column(columnDefinition = "CHAR(1)")
    private String state;
}
