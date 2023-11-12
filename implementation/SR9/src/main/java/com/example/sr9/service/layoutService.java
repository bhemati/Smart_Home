package com.example.sr9.service;

import com.example.sr9.model.Room;
import com.example.sr9.repository.layoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class layoutService {
    @Autowired
    private layoutRepository repo;

    public Room save(Room room) {
        return repo.saveRoom(room);
    }

    public Room find(int id) {
        return repo.findRoom(id);
    }
}
