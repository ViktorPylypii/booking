package backend.development.booking.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class AccommodationResponseDto {
    private Long id;
    private String size;
    private String amenities;
    private BigDecimal price;
    private Integer availableUnits;
}
