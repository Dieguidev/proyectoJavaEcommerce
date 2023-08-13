package com.dieguidev.ecommercejava.persistence.repository;

import com.dieguidev.ecommercejava.persistence.entity.CategoryEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface CategoryRepository extends ListCrudRepository<CategoryEntity, Integer> {
}
