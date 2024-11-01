package com.example.agricorp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "care_logs")
public class CareLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private CareType careType;
    private Timestamp careDate;
    private String notes;
    private Timestamp createdTimestamp;

    @ManyToOne
    @JoinColumn(name = "plants_id")
    private Plants plant;

    @ManyToOne
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;

    public enum CareType { WATERING, FERTILIZATION, PRUNING }
}