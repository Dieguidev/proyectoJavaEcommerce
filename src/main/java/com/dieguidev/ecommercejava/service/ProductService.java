package com.dieguidev.ecommercejava.service;

import com.dieguidev.ecommercejava.persistence.entity.ProductEntity;
import com.dieguidev.ecommercejava.persistence.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository= productRepository;
    }

    public List<ProductEntity> getAll(){
        return this.productRepository.findAll();
    }

}
