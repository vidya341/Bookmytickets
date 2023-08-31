package com.example.BookMyTickets.controllers;

import com.example.BookMyTickets.RequestDTO.add_route_DTO;
import com.example.BookMyTickets.service.routeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/route")
public class routeController {

    @Autowired
    private routeService routeser;

    @PostMapping("/add_route")
    public ResponseEntity add_route(@RequestBody add_route_DTO add_route)
    {
        String ans = routeser.add_route(add_route);
        return new ResponseEntity<>(ans, HttpStatus.OK);
    }
}
