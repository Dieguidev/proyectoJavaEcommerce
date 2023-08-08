package com.dieguidev.ecommercejava.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BuysProductId implements Serializable {
    private Integer idBuys;
    private Integer idProduct;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BuysProductId that)) return false;
        return Objects.equals(idBuys, that.idBuys) && Objects.equals(idProduct, that.idProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBuys, idProduct);
    }
}
