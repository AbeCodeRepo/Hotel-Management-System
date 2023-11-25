package com.hotelapp.hotelapp.dao;

import com.hotelapp.hotelapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDAO extends JpaRepository<User,Integer> {

    User findByUserEmailAndPassword (String userEmail, String password);


}
