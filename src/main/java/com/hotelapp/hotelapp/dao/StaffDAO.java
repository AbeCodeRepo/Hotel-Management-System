package com.hotelapp.hotelapp.dao;

import com.hotelapp.hotelapp.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffDAO  extends JpaRepository<Staff,Integer> {

    Staff findByStaffID (Integer staffID);
}
