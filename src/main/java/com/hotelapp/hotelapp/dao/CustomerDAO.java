package com.hotelapp.hotelapp.dao;

import com.hotelapp.hotelapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerDAO extends JpaRepository<Customer,Integer> {

    Customer findByCustomerID (Integer customerID);

//    List<Customer> findAllByGender (String gender);

}
