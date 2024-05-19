package com.example.sqlexjpa2.controller;

import com.example.sqlexjpa2.models.dtos.ModelSpeedHdDto1;
import com.example.sqlexjpa2.service.PcService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pc")
public class PcController {

    private final PcService pcService;

    public PcController(PcService pcService) {
        this.pcService = pcService;
    }

    @GetMapping
    public String x (){
        return "f4f4f4f4f4f4f4";
    }

    @GetMapping("/task1/{price}")
    public List<ModelSpeedHdDto1> findModelSpeedHdByPriceLess(@PathVariable double price ){
        return pcService.findModelSpeedHdDtoByPriceLess(price);
    }


}
