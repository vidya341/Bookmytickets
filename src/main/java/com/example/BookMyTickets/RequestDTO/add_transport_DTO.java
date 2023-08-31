package com.example.BookMyTickets.RequestDTO;

import com.example.BookMyTickets.Enum.modeoftransport;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class add_transport_DTO {
    private modeoftransport modeOfTransport;
    private LocalDate journeyDate;
    private LocalTime startTime;
    private double journeyTime;
    private Integer routeId;
    private String companyName;

    public add_transport_DTO() {
    }
}
