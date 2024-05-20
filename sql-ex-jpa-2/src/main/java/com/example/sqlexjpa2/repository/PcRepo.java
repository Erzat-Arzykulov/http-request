package com.example.sqlexjpa2.repository;

import com.example.sqlexjpa2.models.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcRepo extends JpaRepository<Pc, Integer> {
    //SELECT model, speed, hd FROM pcs WHERE price < 500

    List<Pc> findAllByPriceLessThan(double price);
}
