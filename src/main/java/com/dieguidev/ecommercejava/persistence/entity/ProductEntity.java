package com.dieguidev.ecommercejava.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product", nullable = false)
    private Integer idProduct;

    @Column(nullable = false,unique = true, length = 45)
    private String name;

    @Column(name = "id_category",nullable = false)
    private Integer idCategory;

    @Column(nullable = false,unique = true,length = 150)
    private String barCode;

    @Column(name = "sale_price",nullable = false, columnDefinition = "Decimal(16,2)")
    private Double salePrice;

    @Column(name = "stock_quantity", nullable = false)
    private Integer stockQuantity;

    @Column(columnDefinition = "TINYINT",nullable = false)
    private Boolean estate;


}
