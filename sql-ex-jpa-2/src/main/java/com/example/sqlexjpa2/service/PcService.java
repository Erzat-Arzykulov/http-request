package com.example.sqlexjpa2.service;

import com.example.sqlexjpa2.models.dtos.ModelSpeedHdDto1;

import java.util.List;

public interface PcService {
    List<ModelSpeedHdDto1> findModelSpeedHdDtoByPriceLess(double price);
}
