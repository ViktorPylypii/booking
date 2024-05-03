package backend.development.booking.mapper;

import backend.development.booking.dto.CustomerLoginResponseDto;
import backend.development.booking.dto.CustomerRegistrationRequestDto;
import backend.development.booking.dto.CustomerRegistrationResponseDto;
import backend.development.booking.model.Customer;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerRegistrationResponseDto toDto(Customer customer);
    Customer toModel(CustomerRegistrationRequestDto requestDto);
}
