package com.example.sqlexjpa2.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "printers")
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
