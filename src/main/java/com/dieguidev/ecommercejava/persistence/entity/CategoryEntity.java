package com.dieguidev.ecommercejava.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "category")
@Getter
@Setter
@NoArgsConstructor
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category", nullable = false)
    private Integer idCategory;

    @Column(nullable = false, length = 45)
    private String description;

    @Column(nullable = false,columnDefinition = "TINYINT")
    private Boolean estate;

    //relaciones
/*
    @OneToMany(mappedBy = "category")
    private List<ProductEntity> products;
*/

}
