package com.project.productManagementAPI.adapters.outbound.repositories;

import com.project.productManagementAPI.adapters.outbound.entities.JpaProductEntity;
import com.project.productManagementAPI.domain.products.Product;
import com.project.productManagementAPI.domain.products.ProductRepository;

public class ProductRepositoryImpl implements ProductRepository {
    private final JpaProductRepository jpaProductRepository;

    public ProductRepositoryImpl(JpaProductRepository jpaProductRepository) {
        this.jpaProductRepository = jpaProductRepository;
    }
    @Override
    public Product save(Product product) {
        return null;
    }
}
