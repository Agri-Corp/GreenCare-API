package com.example.agricorp.model; // Package declaration for the Agricorp model classes

import jakarta.persistence.*; // Import JPA annotations for entity mapping
import lombok.Data; // Import Lombok's @Data annotation for automatic getter/setter generation

@Data // Lombok annotation to generate getters, setters, and other utility methods
@Entity // Indicates that this class is a JPA entity
@Table(name = "subscriptions") // Specifies the table name in the database for this entity
public class Subscriptions {
    
    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies that the ID should be generated automatically
    private int id; // Unique identifier for each subscription

    private String name; // Name of the subscription plan (e.g., Basic, Premium)
    private double price; // Price of the subscription plan

    @ManyToOne // Defines a many-to-one relationship with the Roles entity
    @JoinColumn(name = "roles_id") // Specifies the foreign key column in the subscriptions table
    private Roles role; // The role associated with this subscription
}
