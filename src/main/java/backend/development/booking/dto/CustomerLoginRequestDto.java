package backend.development.booking.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerLoginRequestDto {
    @Email
    @NotNull
    private String email;
    @Size(min = 8, max = 30)
    @NotBlank
    private String password;
}
