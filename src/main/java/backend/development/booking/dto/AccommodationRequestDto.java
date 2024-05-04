package backend.development.booking.dto;

import backend.development.booking.model.Address;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class AccommodationRequestDto {
    @NotNull
    private Address location;
    @NotBlank
    private String size;
    @NotBlank
    private String amenities;
    @NotBlank
    private BigDecimal dalyRate;
    @NotBlank
    private Integer availability;
    @NotNull
    private Address address;
}
