package com.hotelapp.hotelapp.service;


import com.hotelapp.hotelapp.dao.CustomerDAO;
//import com.hotelapp.hotelapp.dao.jdbc.CustomerJDBCDao;
//import com.hotelapp.hotelapp.dao.jdbc.CustomerJDBCDao;
import com.hotelapp.hotelapp.dto.CustomerDTO;
import com.hotelapp.hotelapp.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

//    @Autowired
//    private CustomerJDBCDao customerJDBCDao;


//    public List <CustomerDTO>getAllCustomers (){
//        List<Customer> customers = this.customerDAO.findAll();
//
//        List <CustomerDTO> customerDTOs = new ArrayList<>();
//
//        for (Customer customer : customers){
//            CustomerDTO customerDTO = new CustomerDTO(customer);
//
//            customerDTOs.add(customerDTO);
//        }
//        return customerDTOs;
//    }

    public List<Customer> getAllCustomers(){
        List<Customer> result = customerDAO.findAll();

        List<CustomerDTO> customers = new ArrayList<>();

        for (Customer customer : result){
            CustomerDTO customerDTO = new CustomerDTO(customer);
            customers.add(customerDTO);
        }
        return result;
    }


    public CustomerDTO getCustomerByID (Integer customerID){
        Customer customer = this.customerDAO.findByCustomerID(customerID);
        return new CustomerDTO(customer);
    }


    public CustomerDTO addCustomer(CustomerDTO customerDTO){
        Customer customer = null;

        if (customerDTO.getCustomerID()!= null){
            customer = this.customerDAO.getById(customerDTO.getCustomerID());
        }else {
            customer =  new Customer();
        }



        customer.setCustomerName(customerDTO.getCustomerName());
        customer.setMobileNo(customerDTO.getMobileNo());
        customer.setAddress(customerDTO.getAddress());
        customer.setStatus(customerDTO.getStatus());

        customer = this.customerDAO.saveAndFlush(customer);

        return new CustomerDTO(customer);
    }


//    public List<CustomerDTO> getAllCustomerWithSearch(){
//        List<CustomerDTO> customerDTOS = this.customerJDBCDao.getAllCustomerWithSearch();
//        return customerDTOS;
//    }





    public Customer updateCustomer (Customer customer){
        Customer existingCustomer = this.customerDAO.saveAndFlush(customer);

        return existingCustomer;
    }

//    public List<Customer> getCustomerBygender (String gender){
//        List<Customer> customers = this.customerDAO.findAllBygender(gender);
//        return customers;
//    }
}
