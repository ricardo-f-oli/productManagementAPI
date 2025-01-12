package com.project.productManagementAPI.domain.products;

import java.util.List;

public interface ProductRepository {
    Product save(Product product);
    Product updateProduct(Product product, Long id);
    List<Product> findAll();
    List<Product> findByCriteria(String name, Long categoryId,String sortBy);
    void deleteById(Long id);

}
