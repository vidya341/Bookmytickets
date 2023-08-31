package com.example.BookMyTickets.Transformers;

import com.example.BookMyTickets.RequestDTO.add_transport_DTO;
import com.example.BookMyTickets.models.Transport;
import com.example.BookMyTickets.responseDTO.sho_flights;

public class TransportTransformer {

    public static Transport convert_dto_to_transport(add_transport_DTO add_trans_dto)
    {
        Transport trans_en = Transport.builder().mode(add_trans_dto.getModeOfTransport()).journeyDate(add_trans_dto.getJourneyDate()).journeyTime(add_trans_dto.getJourneyTime()).startTime(add_trans_dto.getStartTime()).companyName(add_trans_dto.getCompanyName()).build();
        return trans_en;
    }
    public static sho_flights convert_to_showflights(Transport trans)
    {
        sho_flights res = sho_flights.builder().journeyDate(trans.getJourneyDate()).journeyTime(trans.getJourneyTime()).startTime(trans.getStartTime()).companyName(trans.getCompanyName()).build();
        return res;
    }
}
