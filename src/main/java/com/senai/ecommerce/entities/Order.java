package com.senai.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Data
@Entity
@Table(name = "tb_order")

public class Order {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO.IDENTITY)
    private Long id;
    private OrderStatus status;
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //Cascade serves to delete the order when the user is deleted
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;
}
