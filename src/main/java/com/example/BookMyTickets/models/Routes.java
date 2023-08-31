package com.example.BookMyTickets.models;

import com.example.BookMyTickets.Enum.City;
import com.example.BookMyTickets.Enum.modeoftransport;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "routes_details")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Routes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer routeid;
    @Enumerated(value = EnumType.STRING)
    private City fromcity;
    @Enumerated(value = EnumType.STRING)
    private City tocity;
    private String listofstopsinbetween;
    @Enumerated(value = EnumType.STRING)
    private modeoftransport mode;

    @OneToMany(mappedBy = "route",cascade = CascadeType.ALL)
    private List<Transport> list_transport = new ArrayList<>();
}
