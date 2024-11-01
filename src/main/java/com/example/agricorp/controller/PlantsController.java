package com.example.agricorp.controller;

import com.example.agricorp.model.Plants;
import com.example.agricorp.service.PlantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * PlantsController handles HTTP requests for the "Plants" entity.
 * It provides endpoints for retrieving and creating plant records.
 */
@RestController // Indicates that this class is a REST controller
@RequestMapping("/plants") // Sets the base URL path for this controller
public class PlantsController {

    // Injects an instance of PlantsService to manage plant-related business logic
    @Autowired
    private PlantsService plantsService;

    /**
     * Retrieves all plants from the database.
     * 
     * @return a list of all plant records.
     */
    @GetMapping // Maps GET requests to this method
    public List<Plants> getAllPlants() {
        return plantsService.getAllPlants(); // Calls the service method to get all plants
    }

    /**
     * Creates a new plant record in the database.
     * 
     * @param plant the Plants object received from the request body.
     * @return the created Plants object after saving it to the database.
     */
    @PostMapping // Maps POST requests to this method
    public Plants createPlant(@RequestBody Plants plant) {
        return plantsService.savePlant(plant); // Calls the service method to save the new plant
    }
}
