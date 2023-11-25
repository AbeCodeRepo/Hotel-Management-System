package com.hotelapp.hotelapp.service;

import com.hotelapp.hotelapp.dao.RoomDAO;
import com.hotelapp.hotelapp.dto.RoomDTO;
import com.hotelapp.hotelapp.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomDAO roomDAO;


    public List<Room> getAllRooms(){
        List<Room> result = roomDAO.findAll();

        List<RoomDTO> rooms = new ArrayList<>();

        for (Room room : result){
            RoomDTO roomDTO = new RoomDTO(room);
            rooms.add(roomDTO);
        }
        return result;
    }



    public RoomDTO getRoomByID (Integer roomID){
        Room room = this.roomDAO.findByRoomID(roomID);
        return new RoomDTO(room);
    }



    public RoomDTO addRoom(RoomDTO roomDTO){
        Room room = null;

        if (roomDTO.getRoomID()!= null){
            room = this.roomDAO.getById(roomDTO.getRoomID());
        }else {
            room =  new Room();
        }



        room.setRoomType(roomDTO.getRoomType());
        room.setRoomNo(roomDTO.getRoomNo());
        room.setOneDayPrice(roomDTO.getOneDayPrice());
        room.setStatus(roomDTO.getStatus());

        room = this.roomDAO.saveAndFlush(room);

        return new RoomDTO(room);
    }
}
