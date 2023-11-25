package com.hotelapp.hotelapp.service;

import com.hotelapp.hotelapp.dao.UserDAO;
import com.hotelapp.hotelapp.dto.LoginRQ;
import com.hotelapp.hotelapp.dto.UserDTO;
import com.hotelapp.hotelapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public UserDTO getLoggedUser(LoginRQ loginRQ){
        User user = this.userDAO.findByUserEmailAndPassword(loginRQ.getUserEmail(),loginRQ.getPassword());

        UserDTO userDTO = null;

        if (user != null){
            userDTO = new UserDTO(user);
        }
        return userDTO;
    }
}
