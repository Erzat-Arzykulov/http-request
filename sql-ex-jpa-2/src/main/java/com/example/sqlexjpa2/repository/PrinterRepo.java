package com.example.sqlexjpa2.repository;

import com.example.sqlexjpa2.models.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrinterRepo extends JpaRepository<Printer, String> {
    //select distinct maker from product
    //where type = 'Printer'
    List<Printer>  findAllMakerFromPrinter();
}
