package com.example.sqlexjpa2.models.dtos;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PrintersMakers {

    String maker;


    public PrintersMakers(String maker) {
    }
}
