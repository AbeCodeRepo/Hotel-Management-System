package com.hotelapp.hotelapp.service;


import com.hotelapp.hotelapp.dao.StaffDAO;
import com.hotelapp.hotelapp.dto.StaffDTO;
import com.hotelapp.hotelapp.model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffDAO staffDAO;


    public List<Staff> getAllStaffs(){
        List<Staff> result = staffDAO.findAll();

        List<StaffDTO> staffs = new ArrayList<>();

        for (Staff staff : result){
            StaffDTO staffDTO = new StaffDTO(staff);
            staffs.add(staffDTO);
        }
        return result;
    }

    public StaffDTO getStaffByID (Integer staffID){
        Staff staff = this.staffDAO.findByStaffID(staffID);
        return new StaffDTO(staff);
    }

    public StaffDTO addStaff(StaffDTO staffDTO){
        Staff staff = null;

        if (staffDTO.getStaffID()!= null){
            staff = this.staffDAO.getById(staffDTO.getStaffID());
        }else {
            staff =  new Staff();
        }



        staff.setName(staffDTO.getName());
        staff.setAddress(staffDTO.getAddress());
        staff.setEmail(staffDTO.getEmail());
        staff.setMobileNo(staffDTO.getMobileNo());
        staff.setGender(staffDTO.getGender());
        staff.setPosition(staffDTO.getPosition());
        staff.setSalary(staffDTO.getSalary());
        staff.setStatus(staffDTO.getStatus());


        staff = this.staffDAO.saveAndFlush(staff);

        return new StaffDTO(staff);
    }

}
