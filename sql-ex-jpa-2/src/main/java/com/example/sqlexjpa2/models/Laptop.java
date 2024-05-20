package com.example.sqlexjpa2.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor

@Entity
@Table(name = "laptops")
public class Laptop {

    @Id
    @Column(name = "code")
    Integer id;

    int speed;

    int ram;

    double hd;

    @Column (nullable = false)
    double price;

    int screen;

    @ManyToOne
    @JoinColumn(name = "model")
    Product product;

}
