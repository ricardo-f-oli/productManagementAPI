package com.project.productManagementAPI.adapters.outbound.repositories;

import com.project.productManagementAPI.adapters.outbound.entities.JpaProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRepository extends JpaRepository<JpaProductEntity, Long> {
}
