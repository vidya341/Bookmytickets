package com.example.BookMyTickets.RequestDTO;


import lombok.Data;

@Data
public class add_flight_seat_DTO {
    private int noOfEconomySeats;
    private int noOfBusinessSeats;

    private int priceOfBusinessSeat;
    private int priceOfEconomySeat;

    private int transportId;
}
