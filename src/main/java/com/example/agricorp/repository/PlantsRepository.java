package com.example.agricorp.repository;

import com.example.agricorp.model.Plants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantsRepository extends JpaRepository<Plants, Integer> {
}