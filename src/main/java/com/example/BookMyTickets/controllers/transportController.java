package com.example.BookMyTickets.controllers;

import com.example.BookMyTickets.RequestDTO.add_transport_DTO;
import com.example.BookMyTickets.RequestDTO.search_flight;
import com.example.BookMyTickets.responseDTO.sho_flights;
import com.example.BookMyTickets.service.TransportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transport")
@Slf4j
public class transportController {

    @Autowired
    private TransportService transser;

    @PostMapping("/add_transport")
    public ResponseEntity add_transport(@RequestBody add_transport_DTO add_trans_dto)
    {
        try{
            String ans = transser.add_transport(add_trans_dto);
            return new ResponseEntity(ans,HttpStatus.OK);
        }
        catch (Exception e)
        {
            log.error("add transport failed {}",e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}
