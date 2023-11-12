package com.example.sr12.repository;

import com.example.sr12.model.maintaining;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface maintainigRepository  extends JpaRepository<maintaining,Integer>{

    List<maintaining> findAll();

    maintaining findById(int id);
    maintaining saveUser(maintaining user);
}

