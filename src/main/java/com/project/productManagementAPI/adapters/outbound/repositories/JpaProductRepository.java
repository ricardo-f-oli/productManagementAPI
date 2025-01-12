package com.project.productManagementAPI.adapters.outbound.repositories;

import com.project.productManagementAPI.adapters.outbound.entities.JpaProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends JpaRepository<JpaProductEntity, Long> {
}
