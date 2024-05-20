package com.example.sqlexjpa2.service;

import com.example.sqlexjpa2.models.dtos.ModelSpeedHdDto;

import java.util.List;

public interface PcService {

    List<ModelSpeedHdDto> findModelSpeedHdDtoByPriceLess(double price);

}
