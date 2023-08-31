package com.example.BookMyTickets.service;

import com.example.BookMyTickets.Enum.modeoftransport;
import com.example.BookMyTickets.RequestDTO.add_transport_DTO;
import com.example.BookMyTickets.RequestDTO.search_flight;
import com.example.BookMyTickets.Transformers.TransportTransformer;
import com.example.BookMyTickets.models.Routes;
import com.example.BookMyTickets.models.Transport;
import com.example.BookMyTickets.repository.TransportRepository;
import com.example.BookMyTickets.repository.routeRepository;
import com.example.BookMyTickets.responseDTO.sho_flights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransportService {

    @Autowired
    private TransportRepository transrepo;
    @Autowired
    private routeRepository routerepo;

    public String add_transport(add_transport_DTO add_trans_dto) throws Exception
    {
        Transport trans_en = TransportTransformer.convert_dto_to_transport(add_trans_dto);
        //we have route id set the route entity
        Optional<Routes> opt_route = routerepo.findById(add_trans_dto.getRouteId());
        if(!opt_route.isPresent())
        {
            throw new Exception("route id is invalid");
        }
        Routes route = opt_route.get();
        trans_en.setRoute(route);
        route.getList_transport().add(trans_en);

        transrepo.save(trans_en);
        return "transport with"+trans_en.getTransport_id()+"is saved";
    }

}
