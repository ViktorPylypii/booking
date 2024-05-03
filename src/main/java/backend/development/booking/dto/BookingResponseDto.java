package backend.development.booking.dto;

import backend.development.booking.model.Accommodation;
import backend.development.booking.model.Customer;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingResponseDto {
    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Accommodation accommodation;
    private Customer user;
}
