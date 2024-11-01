package com.example.agricorp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "user_profile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    @OneToOne
    @JoinColumn(name = "create_users_id")
    private CreateUsers createUser;

    @ManyToOne
    @JoinColumn(name = "subscriptions_id")
    private Subscriptions subscription;
}
