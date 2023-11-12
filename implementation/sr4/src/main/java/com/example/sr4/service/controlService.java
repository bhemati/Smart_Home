package src.main.java.com.example.sr4.service;

import com.example.sr4.model.temperature;
import com.example.sr4.repository.sensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class controlService {

    @Autowired
    private sensorRepository temperatureRepository;


    public temperature save(temperature Temperature)
    {
        return temperatureRepository.saveTemperature(Temperature);
    }


    public List<temperature> findall()
    {
        return this.temperatureRepository.findAll();
    }


    public temperature findByUserPreference(String userPreference)
    {
        return this.temperatureRepository.findByUserPreference(userPreference);
    }

    public temperature findById(int id)
    {
        return this.temperatureRepository.findById(id);
    }
}
