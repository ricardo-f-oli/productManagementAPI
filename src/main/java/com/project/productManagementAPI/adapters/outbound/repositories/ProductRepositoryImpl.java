package com.project.productManagementAPI.adapters.outbound.repositories;

import com.project.productManagementAPI.adapters.outbound.entities.JpaProductEntity;
import com.project.productManagementAPI.domain.products.Product;
import com.project.productManagementAPI.domain.products.ProductRepository;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private final JpaProductRepository jpaProductRepository;

    public ProductRepositoryImpl(JpaProductRepository jpaProductRepository) {
        this.jpaProductRepository = jpaProductRepository;
    }
    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product, Long id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public List<Product> findByCriteria(String name, Long categoryId, String sortBy) {
        return List.of();
    }

    @Override
    public void deleteById(Long id) {

    }
}
