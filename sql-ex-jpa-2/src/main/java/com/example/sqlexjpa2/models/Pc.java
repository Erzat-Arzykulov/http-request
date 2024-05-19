package com.example.sqlexjpa2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
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

        @JsonProperty("model")
        String model;

        @JsonProperty("speed")
        int speed;

        int ram;

        @JsonProperty("hd")
        double hd;

        @Column (nullable = false)
        double price;

        String cd;


        @Override
        public String toString() {
                return "Pc{" +
                        "model: " + model + '\'' +
                        ", speed: " + speed +
                        ", hd: " + hd +
                        '}';
        }



}
