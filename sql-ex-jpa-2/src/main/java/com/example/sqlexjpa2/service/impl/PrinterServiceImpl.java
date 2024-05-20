package com.example.sqlexjpa2.service.impl;

import com.example.sqlexjpa2.models.Printer;
import com.example.sqlexjpa2.models.dtos.PrintersMakers;
import com.example.sqlexjpa2.repository.PrinterRepo;
import com.example.sqlexjpa2.service.PrinterService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrinterServiceImpl implements PrinterService {


    private final PrinterRepo printerRepo;

    public PrinterServiceImpl(PrinterRepo printerRepo) {
        this.printerRepo = printerRepo;
    }


    @Override
    public List<PrintersMakers> allMakersByPrinter() {
        List<Printer> printers = printerRepo.findAllMakerFromPrinter();
        List<PrintersMakers> makers = new ArrayList<>();

        for (Printer printer : printers){
            if (printer.getProduct().getType().equals("printers")){
                makers.add(new PrintersMakers(printer.getProduct().getMaker()));
            }

        }
        return makers;
    }
}
