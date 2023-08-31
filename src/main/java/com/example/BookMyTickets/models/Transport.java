package com.example.BookMyTickets.models;

import com.example.BookMyTickets.Enum.modeoftransport;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tranport_details")
@Data
@Builder


public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transport_id;

    @Enumerated(value = EnumType.STRING)
    private modeoftransport mode;

    private LocalDate journeyDate;

    private LocalTime startTime;

    private double journeyTime;

    private String companyName;

    @ManyToOne
    @JoinColumn
    private Routes route;

    @OneToMany(mappedBy = "transport",cascade = CascadeType.ALL)
    private List<Bookings> bookings = new ArrayList<>();

    @OneToMany(mappedBy = "transport",cascade = CascadeType.ALL)
    List<seat> seatList = new ArrayList<>();
}
