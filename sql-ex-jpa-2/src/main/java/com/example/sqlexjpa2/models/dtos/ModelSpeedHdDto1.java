package com.example.sqlexjpa2.models.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class ModelSpeedHdDto1 {
    String model;

    int speed;

    double hd;
}
