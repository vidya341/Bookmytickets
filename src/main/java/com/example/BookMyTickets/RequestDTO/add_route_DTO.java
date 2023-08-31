package com.example.BookMyTickets.RequestDTO;

import com.example.BookMyTickets.Enum.City;
import com.example.BookMyTickets.Enum.modeoftransport;
import lombok.Data;

@Data

public class add_route_DTO {
    private City fromCity;
    private City  toCity;
    private String stopsInBetween;
    private modeoftransport modeOfTransport;
}
