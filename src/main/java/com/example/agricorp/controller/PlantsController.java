package com.example.agricorp.controller;

import com.example.agricorp.model.Plants;
import com.example.agricorp.service.PlantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for managing "Plants" entity operations.
 * This controller exposes REST endpoints for retrieving and creating plants.
 */
@RestController
@RequestMapping("/plants") // Sets the base path for all endpoints in this controller
public class PlantsController {
    
    // Injects an instance of PlantsService to handle business logic
    @Autowired
    private PlantsService plantsService;

    /**
     * Endpoint to retrieve all plants.
     * @return a list of all available plants.
     */
    @GetMapping // Defines a GET endpoint at "/plants"
    public List<Plants> getAllPlants() {
        return plantsService.getAllPlants();
    }

    /**
     * Endpoint to create a new plant.
     * @param plant an object of type Plants received in the request body.
     * @return the created Plants object saved in the database.
     */
    @PostMapping // Defines a POST endpoint at "/plants"
    public Plants createPlant(@RequestBody Plants plant) {
        return plantsService.savePlant(plant);
    }
}

