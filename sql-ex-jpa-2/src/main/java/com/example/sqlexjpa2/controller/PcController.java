package com.example.sqlexjpa2.controller;

import com.example.sqlexjpa2.models.dtos.ModelSpeedHdDto;
import com.example.sqlexjpa2.service.PcService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PcController {

    private final PcService pcService;

    public PcController(PcService pcService) {
        this.pcService = pcService;
    }

    @GetMapping("/task1/{price}")
    @ResponseBody
    public List<ModelSpeedHdDto> findModelSpeedHdByPriceLess(@PathVariable double price ){
        return pcService.findModelSpeedHdDtoByPriceLess(price);
    }



}
