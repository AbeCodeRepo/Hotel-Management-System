package com.hotelapp.hotelapp.controller;


import com.hotelapp.hotelapp.dto.CustomerDTO;
import com.hotelapp.hotelapp.model.Customer;
import com.hotelapp.hotelapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/getAllCustomers",method = RequestMethod.GET)
    public List<Customer>getAllCustomers(){

        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    public ResponseEntity<CustomerDTO> addCustomer(@RequestBody CustomerDTO customerDTO){
        CustomerDTO newCustomer = this.customerService.addCustomer(customerDTO);

        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/getCustomerByID/{customerID}", method = RequestMethod.GET)
    public ResponseEntity<CustomerDTO> getCustomerByID (@PathVariable Integer customerID){
        CustomerDTO customer = this.customerService.getCustomerByID(customerID);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @RequestMapping(value = "/updateCustomer", method = RequestMethod.PUT)
    public ResponseEntity<Customer> updateCustomer (@RequestBody Customer customer){
        Customer existingCustomer = this.customerService.updateCustomer(customer);

        return new ResponseEntity<>(existingCustomer, HttpStatus.OK);
    }


//    @RequestMapping(value = "/getAllCustomerWithSearch", method = RequestMethod.GET)
//    public ResponseEntity<List<CustomerDTO>> getAllCustomerWithSearch(){
//        List<CustomerDTO> customerS = this.customerService.getAllCustomerWithSearch();
//        return new ResponseEntity<>(customerS, HttpStatus.OK);
//    }

//    @RequestMapping(value = "/getAllCustomers", method = RequestMethod.GET)
//    public ResponseEntity<List<CustomerDTO>> getAllCustomers(){
//
//        List<CustomerDTO> customers = this.customerService.getAllCustomers();
//
//        return new ResponseEntity<>(customers, HttpStatus.OK);
//    }


}
