package com.starlingdiaz.backend.clientsapp.backendclientsapp.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(unique = true)
    private String email;
    @Column(name = "direction")
    private String direction;
    @Column(name = "other_direction")
    private String otherDirection;
}
