package com.example.BookMyTickets.controllers;

import com.example.BookMyTickets.RequestDTO.adduserDTO;
import com.example.BookMyTickets.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class add_user_controller {

    @Autowired
    private userservice userser;


    @PostMapping("/add_user")
    private ResponseEntity add_user(@RequestBody adduserDTO user)
    {
        String ans = userser.add_user(user);
        return new ResponseEntity<>(ans, HttpStatus.OK);

    }

}
