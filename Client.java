package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    // Constructor, getters, and setters
}
