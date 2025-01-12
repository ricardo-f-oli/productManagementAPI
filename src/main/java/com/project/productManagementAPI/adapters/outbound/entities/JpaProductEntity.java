package com.project.productManagementAPI.adapters.outbound.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class JpaProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    private boolean available;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private JpaCategoryEntity category;
}