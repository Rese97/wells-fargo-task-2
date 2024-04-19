package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(name = "purchase_date", nullable = false)
    private Date purchaseDate;

    @Column(name = "purchase_price", nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    // Constructor, getters, and setters
}
