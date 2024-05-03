package backend.development.booking.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CustomerRegistrationRequestDto {
    @Email
    @NotBlank
    private String email;
    @NotBlank
    @Size(min = 8, max = 30)
    private String password;
    @NotBlank
    @Size(max = 20)
    private String firstName;
    @NotBlank
    @Size(max = 20)
    private String lastName;
}
