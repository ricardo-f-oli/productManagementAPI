package com.project.productManagementAPI.adapters.outbound.repositories;

import com.project.productManagementAPI.adapters.outbound.entities.JpaCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCategoryRepository extends JpaRepository<JpaCategoryEntity, Long> {
}
