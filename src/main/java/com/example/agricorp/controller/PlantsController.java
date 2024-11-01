package com.example.agricorp.controller;

import com.example.agricorp.model.Plants;
import com.example.agricorp.service.PlantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for managing operations on the "Plants" entity.
 * This controller provides REST endpoints for retrieving and creating plants.
 */
@RestController
@RequestMapping("/plants") // Sets the base path for all endpoints in this controller
public class PlantsController {

    // Injects an instance of PlantsService to handle the business logic
    @Autowired
    private PlantsService plantsService;

    /**
     * Endpoint to retrieve all plants.
     * This method listens for GET requests and returns a list of all plants.
     * 
     * @return a list of all available plants in the database.
     */
    @GetMapping // Defines a GET endpoint at "/plants"
    public List<Plants> getAllPlants() {
        return plantsService.getAllPlants(); // Calls the service to retrieve all plants
    }

    /**
     * Endpoint to create a new plant.
     * This method listens for POST requests, accepts a Plants object from the request body,
     * and saves it to the database.
     * 
     * @param plant an object of type Plants received in the request body.
     * @return the created Plants object after it is saved in the database.
     */
    @PostMapping // Defines a POST endpoint at "/plants" for creating a new plant
    public Plants createPlant(@RequestBody Plants plant) {
        return plantsService.savePlant(plant); // Calls the service to save the new plant
    }
}
