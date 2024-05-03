package backend.development.booking.dto;

import lombok.Data;

@Data
public class CustomerRegistrationResponseDto {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;

}
