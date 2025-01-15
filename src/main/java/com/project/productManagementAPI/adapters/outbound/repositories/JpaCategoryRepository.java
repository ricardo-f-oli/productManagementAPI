package com.project.productManagementAPI.adapters.outbound.repositories;

import com.project.productManagementAPI.adapters.outbound.entities.JpaCategoryEntity;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCategoryRepository extends JpaRepository<JpaCategoryEntity, Long> {
}
