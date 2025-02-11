package com.senai.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_payment")

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String instant;

    @OneToOne
    @MapsId //Maps the id of the order to the payment
    private Order order;
}
