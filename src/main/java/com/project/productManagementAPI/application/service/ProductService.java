package com.project.productManagementAPI.application.service;

import com.project.productManagementAPI.domain.products.Product;
import com.project.productManagementAPI.domain.products.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> findByCriteria(String name, Long categoryId,String sortBy) {
        return productRepository.findByCriteria(name, categoryId, sortBy);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product, Long id){
        return productRepository.updateProduct(product, id);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
