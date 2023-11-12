package com.example.sr6.service;

import com.example.sr6.model.dimness;
import com.example.sr6.repository.sensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class controlService {

    @Autowired
    private sensorRepository dimnessRepository;


    public dimness save(dimness Dimness)
    {
        return dimnessRepository.savedimness(Dimness);
    }


    public List<dimness> findall()
    {
        return this.dimnessRepository.findAll();
    }


    public dimness findByUserPreference(String userPreference)
    {
        return this.dimnessRepository.findByUserPreference(userPreference);
    }

    public dimness findById(int id)
    {
        return this.dimnessRepository.findById(id);
    }
}
