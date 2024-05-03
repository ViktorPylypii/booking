package backend.development.booking.dto;

import backend.development.booking.model.Address;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

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
