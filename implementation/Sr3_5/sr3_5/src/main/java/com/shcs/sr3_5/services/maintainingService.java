package com.example.sr12.services;

import com.example.sr12.model.maintaining;
import com.example.sr12.repository.maintainigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class maintainingService {

    @Autowired
    private maintainigRepository maintainig_Repository;


    public maintaining save(maintaining maint)
    {
        return maintainig_Repository.saveUser(maint);
    }

    public List<maintaining> findall()
    {
        return this.maintainig_Repository.findAll();
    }

    public maintaining findById(int id)
    {
        return this.maintainig_Repository.findById(id);
    }

}
