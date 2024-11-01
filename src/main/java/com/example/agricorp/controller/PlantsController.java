package com.example.agricorp.controller;

import com.example.agricorp.model.Plants; // Import the Plants model
import com.example.agricorp.service.PlantsService; // Import the service to handle business logic related to Plants
import org.springframework.beans.factory.annotation.Autowired; // Import the annotation for dependency injection
import org.springframework.web.bind.annotation.*; // Import annotations for building a REST controller

import java.util.List; // Import the List class to handle collections of plants

@RestController // Indicates that this class is a REST controller
@RequestMapping("/plants") // Defines the base route for all requests to this controller
public class PlantsController {
    
    @Autowired // Allows Spring to automatically inject the PlantsService instance
    private PlantsService plantsService; // Instance of the service that handles plant logic

    // Handles GET requests to retrieve all plants
    @GetMapping 
    public List<Plants> getAllPlants() {
        return plantsService.getAllPlants(); // Calls the service to get all plants
    }

    // Handles POST requests to create a new plant
    @PostMapping 
    public Plants createPlant(@RequestBody Plants plant) {
        return plantsService.savePlant(plant); // Calls the service to save the new plant and returns the saved object
    }
}
