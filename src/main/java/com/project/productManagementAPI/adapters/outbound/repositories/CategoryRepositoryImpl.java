package com.project.productManagementAPI.adapters.outbound.repositories;

import com.project.productManagementAPI.domain.categories.Category;
import com.project.productManagementAPI.domain.categories.CategoryRepository;

public class CategoryRepositoryImpl implements CategoryRepository {

    private final JpaCategoryRepository jpaCategoryRepository;

    public CategoryRepositoryImpl(JpaCategoryRepository jpaCategoryRepository) {
        this.jpaCategoryRepository = jpaCategoryRepository;
    }

    @Override
    public Category save(Category category) {
        return null;
    }
}
