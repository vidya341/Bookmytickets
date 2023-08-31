package com.example.BookMyTickets.RequestDTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class bookings {
    private String seatNos; //Comma seperated Values : 1A,1C,1E

    private LocalDate journeyDate;

    private Integer transportId;

    private Integer userId;
}
