package com.example.sqlexjpa2.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "printers")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Printer {

    @Id
    @Column (name = "code")
    Integer id;

    char color;

    String type;

    @Column(nullable = false)
    double price;

    @ManyToOne
    @JoinColumn(name = "model")
    Product product;
}
