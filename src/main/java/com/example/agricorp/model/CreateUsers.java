package com.example.agricorp.model; // Package declaration for the Agricorp model classes

import jakarta.persistence.*; // Import JPA annotations for entity mapping
import lombok.Data; // Import Lombok's @Data annotation for automatic getter/setter generation

@Data // Lombok annotation to generate getters, setters, and other utility methods
@Entity // Indicates that this class is a JPA entity
@Table(name = "create_users") // Specifies the table name in the database for this entity
public class CreateUsers {
    
    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies that the ID should be generated automatically
    private int id; // Unique identifier for each user

    private String firstName; // First name of the user
    private String lastName; // Last name of the user
    private String email; // Email address of the user
    private String password; // User's password, should be handled securely
}
