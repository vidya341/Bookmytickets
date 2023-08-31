package com.example.BookMyTickets.repository;

import com.example.BookMyTickets.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<Users,Integer> {

}
