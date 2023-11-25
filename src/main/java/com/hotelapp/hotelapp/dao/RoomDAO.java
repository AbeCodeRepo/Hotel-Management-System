package com.hotelapp.hotelapp.dao;

import com.hotelapp.hotelapp.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomDAO extends JpaRepository<Room, Integer> {

    Room findByRoomID (Integer roomID);
}
