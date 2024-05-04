package backend.development.booking.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDate;
import lombok.Data;

@Data
public class BookingRequestDto {
    @NotNull
    @Positive
    private Long accommodationId;
    @NotNull
    private LocalDate checkIn;
    @NotNull
    private LocalDate checkOut;
}
