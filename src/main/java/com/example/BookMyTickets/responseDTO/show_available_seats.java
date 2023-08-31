package com.example.BookMyTickets.responseDTO;

import com.example.BookMyTickets.Enum.Seattype;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class show_available_seats {
    private String seatNo;
    private Seattype seatType;
    private Integer seatPrice;

}
