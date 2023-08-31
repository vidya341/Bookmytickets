package com.example.BookMyTickets.models;

import com.example.BookMyTickets.Enum.Seattype;
import com.example.BookMyTickets.Enum.Seattype;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "seats")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class seat {
    @Id
    private Integer seatId;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private Seattype seatType;

    private Integer price;
    @ManyToOne
    @JoinColumn
    private Transport transport;
}
