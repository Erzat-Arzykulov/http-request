package com.example.sqlexjpa2.service.impl;

import com.example.sqlexjpa2.models.Pc;
import com.example.sqlexjpa2.models.dtos.ModelSpeedHdDto1;
import com.example.sqlexjpa2.repository.PcRepo;
import com.example.sqlexjpa2.service.PcService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class PcServiceImpl implements PcService {

    private final PcRepo pcRepo;

    public PcServiceImpl(PcRepo pcRepo) {
        this.pcRepo = pcRepo;
    }


    @Override
    public List<ModelSpeedHdDto1> findModelSpeedHdDtoByPriceLess(double price) {
        List<Pc> pcs = pcRepo.findAllByPriceLessThan(price);
        List<ModelSpeedHdDto1> modelSpeedHdDto1s = new ArrayList<>();
        pcs.stream().forEach(System.out::println);

        return modelSpeedHdDto1s;
    }

}
