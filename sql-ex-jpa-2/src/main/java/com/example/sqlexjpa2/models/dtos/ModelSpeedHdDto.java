package com.example.sqlexjpa2.models.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class ModelSpeedHdDto {

    String model;

    int speed;

    double hd;

}
