package com.example.sqlexjpa2.service.impl;

import com.example.sqlexjpa2.models.Pc;
import com.example.sqlexjpa2.models.Product;
import com.example.sqlexjpa2.models.dtos.ModelSpeedHdDto;
import com.example.sqlexjpa2.repository.PcRepo;
import com.example.sqlexjpa2.service.PcService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PcServiceImpl implements PcService {

    private final PcRepo pcRepo;

    public PcServiceImpl(PcRepo pcRepo) {
        this.pcRepo = pcRepo;
    }


    @Override
    public List<ModelSpeedHdDto> findModelSpeedHdDtoByPriceLess(double price) {
        List<Pc> pcs = pcRepo.findAllByPriceLessThan(price);
        List<ModelSpeedHdDto> modelSpeedHdDtos = new ArrayList<>();

        for (Pc pc : pcs) {
            modelSpeedHdDtos.add(new ModelSpeedHdDto(pc.getProduct().getModel(), pc.getSpeed(), pc.getHd()));
        }

        return modelSpeedHdDtos;

//        return pcs.stream()
//                .map(l -> {
//                    Product product = l.getProduct();
//                    return new ModelSpeedHdDto(product.getModel(), l.getSpeed(), l.getHd());
//                })
//                .collect(Collectors.toList());
    }

}
