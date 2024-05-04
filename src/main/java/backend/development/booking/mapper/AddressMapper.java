package backend.development.booking.mapper;

import backend.development.booking.config.MapperConfig;
import backend.development.booking.dto.AccommodationRequestDto;
import backend.development.booking.dto.AddressResponseDto;
import backend.development.booking.model.Address;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface AddressMapper {

    AddressResponseDto toDto(Address address);

    Address toModel(AccommodationRequestDto accommodationRequestDto);
}
