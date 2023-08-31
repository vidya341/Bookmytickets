package com.example.BookMyTickets.Transformers;

import com.example.BookMyTickets.RequestDTO.add_route_DTO;
import com.example.BookMyTickets.models.Routes;

public class RouteTransformer {

    public static Routes convertadd_routeDTO_to_Routes(add_route_DTO add_route)
    {
        Routes route = Routes.builder().fromcity(add_route.getFromCity()).tocity(add_route.getToCity()).listofstopsinbetween(add_route.getStopsInBetween()).mode(add_route.getModeOfTransport()).build();
        return route;
    }
}
