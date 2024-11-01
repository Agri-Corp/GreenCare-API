package com.example.agricorp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for the Agricorp application.
 * This class bootstraps the Spring Boot application.
 */
@SpringBootApplication // Marks this as a Spring Boot application and enables auto-configuration
public class AgricorpApplication {

    /**
     * Main method that starts the application.
     * It calls SpringApplication.run() to launch the Spring Boot application.
     * 
     * @param args command-line arguments (if any) for the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(AgricorpApplication.class, args); // Launches the Spring Boot application
    }
}
