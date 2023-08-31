package com.example.BookMyTickets.repository;

import com.example.BookMyTickets.Enum.City;
import com.example.BookMyTickets.Enum.modeoftransport;
import com.example.BookMyTickets.models.Routes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface routeRepository extends JpaRepository<Routes,Integer> {
    //enity,datatype of that Table PK


}

