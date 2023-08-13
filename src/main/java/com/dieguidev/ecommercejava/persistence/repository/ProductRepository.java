package com.dieguidev.ecommercejava.persistence.repository;

import com.dieguidev.ecommercejava.persistence.entity.ProductEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductRepository extends ListCrudRepository<ProductEntity, Integer> {
}
