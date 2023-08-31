package com.example.BookMyTickets.RequestDTO;

import lombok.Data;

import java.time.LocalDate;
@Data
public class get_available_seats {
    private LocalDate journeyDate;
    private int transportId;
}
