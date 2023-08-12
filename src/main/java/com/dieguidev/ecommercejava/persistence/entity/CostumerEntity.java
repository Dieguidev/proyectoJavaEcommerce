package com.dieguidev.ecommercejava.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "costumer")
@Getter
@Setter
@NoArgsConstructor
public class CostumerEntity {
    @Id
    @Column(name = "id_customer", nullable = false)
    private String idCustomer;

    @Column(nullable = false, length = 40)
    private String name;

    @Column(nullable = false, length = 100)
    private String surname;

    @Column(name = "cell_phone" )
    private String cellPhone;

    @Column(length = 80)
    private String address;

    @Column(length = 70, unique = true )
    private String email;

    //relaciones

    @OneToMany(mappedBy = "costumer")
    private List<BuysEntity> buys;


}
