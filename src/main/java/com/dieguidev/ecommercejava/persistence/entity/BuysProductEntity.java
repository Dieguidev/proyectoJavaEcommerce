package com.dieguidev.ecommercejava.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "buys_products")
@IdClass(BuysProductId.class)
@Getter
@Setter
@NoArgsConstructor
public class BuysProductEntity {
    @Id
    @Column(name = "id_buys", nullable = false)
    private Integer idBuys;

    @Id
    @Column(name = "id_product", nullable = false)
    private Integer idProduct;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false, columnDefinition = "DECIMAL(16,2)")
    private Double total;

    @Column(nullable = false, columnDefinition = "TINYINT")
    private Boolean estate;
}
