package com.example.sr9.repository;

import com.example.sr9.model.Device;
import com.example.sr9.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface layoutRepository extends JpaRepository<Room,Integer> {
    List<Room> findAllRoom();
    Room findRoom(int id);
    Room saveRoom(Room room);
    Device findDevice(int deviceID);

}
