package com.senai.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_order")

public class Order {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO.IDENTITY)
    private Long id;
    private String status;
    private String instant;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //Cascade serves to delete the order when the user is deleted
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;
}
