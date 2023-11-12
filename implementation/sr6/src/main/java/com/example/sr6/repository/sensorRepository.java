package com.example.sr6.repository;

import com.example.sr6.model.dimness;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface sensorRepository extends JpaRepository<dimness,Integer>{
    List<dimness> findAll();
    dimness findByUserPreference(String userPreference);

    dimness findById(int id);
    dimness savedimness(dimness Dimness);
}
