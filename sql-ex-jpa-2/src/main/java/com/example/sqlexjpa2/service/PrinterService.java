package com.example.sqlexjpa2.service;

import com.example.sqlexjpa2.models.dtos.PrintersMakers;

import java.util.List;

public interface PrinterService {
    List<PrintersMakers> allMakersByPrinter();
}
