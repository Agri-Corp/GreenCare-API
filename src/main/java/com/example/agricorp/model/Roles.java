package com.example.agricorp.model; // Package declaration for the Agricorp model classes

import jakarta.persistence.*; // Import JPA annotations for entity mapping
import lombok.Data; // Import Lombok's @Data annotation for automatic getter/setter generation

@Data // Lombok annotation to generate getters, setters, and other utility methods
@Entity // Indicates that this class is a JPA entity
@Table(name = "roles") // Specifies the table name in the database for this entity
public class Roles {
    
    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies that the ID should be generated automatically
    private int id; // Unique identifier for each role

    private String name; // Name of the role (e.g., ADMIN, USER)
    private String description; // Description of the role's purpose and permissions
}
