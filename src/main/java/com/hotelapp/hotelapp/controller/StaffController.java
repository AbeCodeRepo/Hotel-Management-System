package com.hotelapp.hotelapp.controller;


import com.hotelapp.hotelapp.dto.StaffDTO;
import com.hotelapp.hotelapp.model.Staff;
import com.hotelapp.hotelapp.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;


    @RequestMapping(value = "/getAllStaffs",method = RequestMethod.GET)
    public List<Staff> getAllStaffs(){

        return staffService.getAllStaffs();
    }


    @RequestMapping(value = "/getStaffByID/{staffID}", method = RequestMethod.GET)
    public ResponseEntity<StaffDTO> getStaffByID (@PathVariable Integer staffID){
        StaffDTO staff = this.staffService.getStaffByID(staffID);
        return new ResponseEntity<>(staff, HttpStatus.OK);
    }

    @RequestMapping(value = "/addStaff", method = RequestMethod.POST)
    public ResponseEntity<StaffDTO> addStaff(@RequestBody StaffDTO staffDTO){
        StaffDTO newStaff = this.staffService.addStaff(staffDTO);

        return new ResponseEntity<>(newStaff, HttpStatus.CREATED);
    }
}
