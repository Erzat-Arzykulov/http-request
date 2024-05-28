package com.example.rental_things.models.dto;

import com.example.rental_things.models.Clients;
import com.example.rental_things.models.Operation;
import com.example.rental_things.models.OperationProducts;
import com.example.rental_things.models.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;


public record PostRequestDto(

        @JsonProperty("first_name")
        String firstName,
        @JsonProperty("last_name")
        String lastName,

        String patronymic,

        Long inn,

        String address,

        int inventoryNumber,

        String startDate,

        String endDate


) {



}
