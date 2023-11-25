package com.hotelapp.hotelapp.dto;

import com.hotelapp.hotelapp.model.Staff;

public class StaffDTO {

    private Integer staffID;
    private String name;
    private String address;
    private String email;
    private String mobileNo;
    private String gender;
    private String position;
    private Double salary;
    private String status;


    public StaffDTO() {
    }


    public StaffDTO(Staff staff) {
        this.staffID = staff.getStaffID();
        this.name = staff.getName();
        this.address = staff.getAddress();
        this.email = staff.getEmail();
        this.mobileNo = staff.getMobileNo();
        this.gender = staff.getGender();
        this.position = staff.getPosition();
        this.salary = staff.getSalary();
        this.status = staff.getStatus();
    }

    public Integer getStaffID() {
        return staffID;
    }

    public void setStaffID(Integer staffID) {
        this.staffID = staffID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
