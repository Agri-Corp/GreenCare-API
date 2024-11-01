package com.example.agricorp.model; // Package declaration for the Agricorp model classes

import jakarta.persistence.*; // Import JPA annotations for entity mapping
import lombok.Data; // Import Lombok's @Data annotation for automatic getter/setter generation

import java.sql.Timestamp; // Import Timestamp class for date and time representation

@Data // Lombok annotation to generate getters, setters, and other utility methods
@Entity // Indicates that this class is a JPA entity
@Table(name = "care_logs") // Specifies the table name in the database for this entity
public class CareLogs {
    
    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies that the ID should be generated automatically
    private int id; // Unique identifier for each care log entry

    @Enumerated(EnumType.STRING) // Indicates that the enum should be persisted as a string in the database
    private CareType careType; // Type of care performed (e.g., watering, fertilization, pruning)

    private Timestamp careDate; // Date and time when the care activity was performed
    private String notes; // Additional notes regarding the care activity
    private Timestamp createdTimestamp; // Timestamp for when the care log entry was created

    @ManyToOne // Indicates a many-to-one relationship with the Plants entity
    @JoinColumn(name = "plants_id") // Specifies the foreign key column in the care_logs table
    private Plants plant; // Reference to the associated plant for which care is logged

    @ManyToOne // Indicates a many-to-one relationship with the UserProfile entity
    @JoinColumn(name = "user_profile_id") // Specifies the foreign key column in the care_logs table
    private UserProfile userProfile; // Reference to the user profile associated with the care log entry

    // Enum to define the types of care activities
    public enum CareType { 
        WATERING, // Represents watering care activity
        FERTILIZATION, // Represents fertilization care activity
        PRUNING // Represents pruning care activity
    }
}
