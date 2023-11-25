package com.hotelapp.hotelapp.controller;

import com.hotelapp.hotelapp.dto.RoomDTO;
import com.hotelapp.hotelapp.model.Room;
import com.hotelapp.hotelapp.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;


    @RequestMapping(value = "/getAllRooms",method = RequestMethod.GET)
    public List<Room> getAllRooms(){

        return roomService.getAllRooms();
    }

    @RequestMapping(value = "/addRoom", method = RequestMethod.POST)
    public ResponseEntity<RoomDTO> addCustomer(@RequestBody RoomDTO roomDTO){
        RoomDTO newRoom = this.roomService.addRoom(roomDTO);

        return new ResponseEntity<>(newRoom, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/getRoomByID/{roomID}", method = RequestMethod.GET)
    public ResponseEntity<RoomDTO> getRoomByID (@PathVariable Integer roomID){
        RoomDTO room = this.roomService.getRoomByID(roomID);
        return new ResponseEntity<>(room, HttpStatus.OK);
    }
}
