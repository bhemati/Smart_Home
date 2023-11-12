package src.main.java.com.example.sr4.repository;

import com.example.sr6.model.dimness;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface sensorRepository extends JpaRepository<temperature,Integer>{
    List<temperature> findAll();
    temperature findByUserPreference(String userPreference);

    temperature findById(int id);
    temperature savetemperature(temperature Temperature);
}
