package com.senai.ecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "tb_user")

public class User {

    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String roles;
    private Date birthDate;

}
