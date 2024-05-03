package backend.development.booking.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccommodationResponseDto {
    private Long id;
    private String size;
    private String amenities;
    private BigDecimal price;
    private Integer availableUnits;
}
