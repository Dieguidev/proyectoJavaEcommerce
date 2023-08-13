package com.dieguidev.ecommercejava.web.controller;

import com.dieguidev.ecommercejava.persistence.entity.ProductEntity;
import com.dieguidev.ecommercejava.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductEntity>> getAll() {
        return ResponseEntity.ok(this.productService.getAll());
    }
}
