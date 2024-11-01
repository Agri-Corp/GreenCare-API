package com.example.agricorp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "create_users")
public class CreateUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
