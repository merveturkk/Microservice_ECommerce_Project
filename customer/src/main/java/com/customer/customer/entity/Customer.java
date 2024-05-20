package com.customer.customer.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
@Entity
@Table(name = "customer")
public class Customer  implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 30)
    private String email;

    private String address;
    private String name;

}