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
@Table(name = "pcs")
public class Pc {

        @Id
        @Column(name = "code")
        Integer id;

        int speed;

        int ram;

        double hd;

        @Column (nullable = false)
        double price;

        String cd;

        @ManyToOne
        @JoinColumn(name = "model")
        Product product;

}
