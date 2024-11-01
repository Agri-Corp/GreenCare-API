package com.example.agricorp.model; // Package declaration for the Agricorp model classes

import jakarta.persistence.*; // Import JPA annotations for entity mapping
import lombok.Data; // Import Lombok's @Data annotation for automatic getter/setter generation
import java.sql.Timestamp; // Import Timestamp for date and time representation

@Data // Lombok annotation to generate getters, setters, and other utility methods
@Entity // Indicates that this class is a JPA entity
@Table(name = "tips") // Specifies the table name in the database for this entity
public class Tips {
    
    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies that the ID should be generated automatically
    private int id; // Unique identifier for each tip

    private String title; // Title of the tip
    private String content; // Content of the tip providing valuable information

    private Timestamp createdAt; // Timestamp for when the tip was created
    private Timestamp updatedAt; // Timestamp for when the tip was last updated

    @ManyToOne // Defines a many-to-one relationship with the Plants entity
    @JoinColumn(name = "plants_id") // Specifies the foreign key column in the tips table
    private Plants plant; // The plant associated with this tip
}
