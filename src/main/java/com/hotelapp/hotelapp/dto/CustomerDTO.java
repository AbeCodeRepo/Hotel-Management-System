package com.hotelapp.hotelapp.dto;

import com.hotelapp.hotelapp.model.Customer;

public class CustomerDTO {

    private Integer customerID;

    private String customerName;

    private String mobileNo;

    private String address;

    private String status;


    public CustomerDTO() {
    }

    public CustomerDTO(Customer customer) {
        this.customerID = customer.getCustomerID();
        this.customerName = customer.getCustomerName();
        this.mobileNo = customer.getMobileNo();
        this.address = customer.getAddress();
        this.status = customer.getStatus();
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
