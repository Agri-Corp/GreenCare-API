package com.example.agricorp.gardenManagement.controllers;


import com.example.agricorp.gardenManagement.models.Garden;
import com.example.agricorp.gardenManagement.services.GardenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/garden")
public class GardenController {

    private final GardenService gardenService;

    public GardenController(GardenService gardenService) {
        this.gardenService = gardenService;
    }

    @GetMapping
    public List<Garden> getAllGardens() {
        return gardenService.getAllGardens();
    }
}
