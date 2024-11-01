package com.example.agricorp.model; // Package declaration for the Agricorp model classes

import jakarta.persistence.*; // Import JPA annotations for entity mapping
import lombok.Data; // Import Lombok's @Data annotation for automatic getter/setter generation
import java.sql.Timestamp; // Import Timestamp for date and time representation

@Data // Lombok annotation to generate getters, setters, and other utility methods
@Entity // Indicates that this class is a JPA entity
@Table(name = "plants") // Specifies the table name in the database for this entity
public class Plants {
    
    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies that the ID should be generated automatically
    private int id; // Unique identifier for each plant

    private String name; // Common name of the plant
    private String scientificName; // Scientific name of the plant
    private String description; // Description of the plant's characteristics and care

    @Enumerated(EnumType.STRING) // Specifies that the enum should be stored as a string in the database
    private CareLevel careLevel; // Indicates the care level required for the plant

    @Enumerated(EnumType.STRING) // Specifies that the enum should be stored as a string in the database
    private GrowthRate growthRate; // Indicates the growth rate of the plant

    private Timestamp createdAt; // Timestamp for when the plant record was created
    private Timestamp updatedAt; // Timestamp for when the plant record was last updated

    // Enum to define different care levels for plants
    public enum CareLevel { LOW, MEDIUM, HIGH }

    // Enum to define different growth rates for plants
    public enum GrowthRate { SLOW, MEDIUM, FAST }
}
