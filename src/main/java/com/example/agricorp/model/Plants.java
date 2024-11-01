package com.example.agricorp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "plants")
public class Plants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String scientificName;
    private String description;

    @Enumerated(EnumType.STRING)
    private CareLevel careLevel;

    @Enumerated(EnumType.STRING)
    private GrowthRate growthRate;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    public enum CareLevel { LOW, MEDIUM, HIGH }
    public enum GrowthRate { SLOW, MEDIUM, FAST }
}