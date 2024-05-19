package com.example.sqlexjpa2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "pcs")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pc {

        @Id
        @Column(name = "code")
        Integer id;

        String model;

        int speed;

        int ram;

        double hd;

        @Column (nullable = false)
        double price;

        String cd;




}
