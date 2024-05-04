package backend.development.booking.mapper;

import backend.development.booking.config.MapperConfig;
import backend.development.booking.dto.AccommodationRequestDto;
import backend.development.booking.dto.AccommodationResponseDto;
import backend.development.booking.model.Accommodation;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class, uses = AddressMapper.class)
public interface AccommodationMapper {

    AccommodationResponseDto toDto(Accommodation accommodation);

    Accommodation toModel(AccommodationRequestDto accommodationRequestDto);
}
