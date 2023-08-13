package com.dieguidev.ecommercejava.service;

import com.dieguidev.ecommercejava.persistence.entity.CategoryEntity;
import com.dieguidev.ecommercejava.persistence.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryEntity> getAll() {
        return this.categoryRepository.findAll();
    }
}
