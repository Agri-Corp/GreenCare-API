package com.example.agricorp.controller;

import com.example.agricorp.model.Plants;
import com.example.agricorp.service.PlantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plants")
public class PlantsController {
    @Autowired
    private PlantsService plantsService;

    @GetMapping
    public List<Plants> getAllPlants() {
        return plantsService.getAllPlants();
    }

    @PostMapping
    public Plants createPlant(@RequestBody Plants plant) {
        return plantsService.savePlant(plant);
    }
}