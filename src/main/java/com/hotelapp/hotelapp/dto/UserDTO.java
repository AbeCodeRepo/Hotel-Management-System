package com.hotelapp.hotelapp.dto;

import com.hotelapp.hotelapp.model.User;

public class UserDTO {

    private Integer userID;

    private String userName;

    private String userEmail;

    private String password;

    private String status;


    public UserDTO() {
    }

    public UserDTO(User user) {
        this.userID = user.getUserID();
        this.userName = user.getUserName();
        this.userEmail = user.getUserEmail();
        this.password = user.getPassword();
        this.status = user.getStatus();
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
