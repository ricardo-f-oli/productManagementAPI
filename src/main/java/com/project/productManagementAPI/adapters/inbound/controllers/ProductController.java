package com.project.productManagementAPI.adapters.inbound.controllers;

import com.project.productManagementAPI.application.service.ProductService;
import com.project.productManagementAPI.domain.products.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return new ArrayList<>();
//        return productService.getAllProducts();
    }

    @GetMapping("/products/id")
    public List<Product> getProductsParam(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Long categoryId,
            @RequestParam(required = false, defaultValue = "id") String sortBy
    ) {
        return new ArrayList<>();
//        return productService.findByCriteria(name, categoryId, sortBy);
    }

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return new Product();
//        return productService.saveProduct(product);
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable Long id){
        return new Product();
//        return productService.updateProduct(product, id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
//        productService.deleteProduct(id);
    }
}
