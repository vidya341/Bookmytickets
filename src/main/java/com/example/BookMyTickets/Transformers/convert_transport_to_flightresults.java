package com.example.BookMyTickets.Transformers;

import com.example.BookMyTickets.models.Transport;
import com.example.BookMyTickets.responseDTO.sho_flights;

public class convert_transport_to_flightresults {
    public static sho_flights convert_to_showflights(Transport trans)
    {
        sho_flights res = sho_flights.builder().journeyDate(trans.getJourneyDate()).journeyTime(trans.getJourneyTime()).startTime(trans.getStartTime()).companyName(trans.getCompanyName()).build();
        return res;
    }

}
