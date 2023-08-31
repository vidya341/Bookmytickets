package com.example.BookMyTickets.repository;

import com.example.BookMyTickets.models.Routes;
import com.example.BookMyTickets.models.Transport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransportRepository extends JpaRepository<Transport,Integer> {

}
