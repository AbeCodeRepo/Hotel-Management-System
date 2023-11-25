package com.hotelapp.hotelapp.model;

import javax.persistence.*;

@Entity
@Table(name = "t_room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROOM_ID")
    private Integer roomID;

    @Column(name = "ROOM_TYPE")
    private String roomType;

    @Column(name = "ROOM_NO")
    private String roomNo;

    @Column(name = "ONE_DAY_PRICE")
    private Double oneDayPrice ;

    @Column(name = "STATUS")
    private String status;


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
