package com.example.BookMyTickets.RequestDTO;

import com.example.BookMyTickets.Enum.City;
import lombok.Data;

import java.time.LocalDate;

@Data
public class search_flight {
    private City fromCity;
    private City toCity;
    private LocalDate journeyDate;

    public search_flight() {
    }
}
