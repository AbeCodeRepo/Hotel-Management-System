package com.hotelapp.hotelapp.dto;

import com.hotelapp.hotelapp.model.Room;

public class RoomDTO {

    private Integer roomID;
    private String roomType;
    private String roomNo;
    private Double oneDayPrice ;
    private String status;


    public RoomDTO() {
    }

    public RoomDTO(Room room) {
        this.roomID = room.getRoomID();
        this.roomType = room.getRoomType();
        this.roomNo = room.getRoomNo();
        this.oneDayPrice = room.getOneDayPrice();
        this.status = room.getStatus();
    }

    public Integer getRoomID() {
        return roomID;
    }

    public void setRoomID(Integer roomID) {
        this.roomID = roomID;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public Double getOneDayPrice() {
        return oneDayPrice;
    }

    public void setOneDayPrice(Double oneDayPrice) {
        this.oneDayPrice = oneDayPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
