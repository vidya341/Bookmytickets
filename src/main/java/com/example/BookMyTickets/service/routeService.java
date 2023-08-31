package com.example.BookMyTickets.service;

import com.example.BookMyTickets.RequestDTO.add_route_DTO;
import com.example.BookMyTickets.Transformers.RouteTransformer;
import com.example.BookMyTickets.models.Routes;
import com.example.BookMyTickets.repository.routeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class routeService {

    @Autowired
    private routeRepository routerepo;


    public String add_route(add_route_DTO add_route)
    {
        Routes route = RouteTransformer.convertadd_routeDTO_to_Routes(add_route);
        //no need to create obj here directly call for transformers
        routerepo.save(route);
        return "Route with "+route.getRouteid()+" is saved";
    }
}
