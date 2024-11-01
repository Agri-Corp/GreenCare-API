package com.example.agricorp.model; // Package declaration for the Agricorp model classes

import jakarta.persistence.*; // Import JPA annotations for entity mapping
import lombok.Data; // Import Lombok's @Data annotation for automatic getter/setter generation
import java.sql.Timestamp; // Import Timestamp for date and time representation

@Data // Lombok annotation to generate getters, setters, and other utility methods
@Entity // Indicates that this class is a JPA entity
@Table(name = "user_profile") // Specifies the table name in the database for this entity
public class UserProfile {
    
    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies that the ID should be generated automatically
    private int id; // Unique identifier for each user profile

    private Timestamp createdAt; // Timestamp for when the user profile was created
    private Timestamp updatedAt; // Timestamp for when the user profile was last updated

    @OneToOne // Defines a one-to-one relationship with the CreateUsers entity
    @JoinColumn(name = "create_users_id") // Specifies the foreign key column in the user_profile table
    private CreateUsers createUser; // The user associated with this profile

    @ManyToOne // Defines a many-to-one relationship with the Subscriptions entity
    @JoinColumn(name = "subscriptions_id") // Specifies the foreign key column in the user_profile table
    private Subscriptions subscription; // The subscription associated with this user profile
}
