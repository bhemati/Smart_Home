package com.shcs.sr3_5.repository;

import com.example.sr3_5.model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface monitoringRepository  extends JpaRepository<monitoring,Integer>{

    monitoring getSensorId(int room.id, enum sensorType);
    monitoring getSensorValue(int sensor.id);
}

