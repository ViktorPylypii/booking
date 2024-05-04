package backend.development.booking.dto;

import backend.development.booking.model.Accommodation;
import backend.development.booking.model.Customer;
import java.time.LocalDate;
import lombok.Data;

@Data
public class BookingResponseDto {
    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Accommodation accommodation;
    private Customer user;
}
