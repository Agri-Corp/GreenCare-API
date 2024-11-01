package com.example.agricorp.service;

import com.example.agricorp.model.Plants;
import com.example.agricorp.repository.PlantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantsService {
    @Autowired
    private PlantsRepository plantsRepository;

    public List<Plants> getAllPlants() {
        return plantsRepository.findAll();
    }

    public Plants savePlant(Plants plant) {
        return plantsRepository.save(plant);
    }
}