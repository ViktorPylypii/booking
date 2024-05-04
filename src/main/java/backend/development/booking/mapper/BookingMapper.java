package backend.development.booking.mapper;

import backend.development.booking.config.MapperConfig;
import backend.development.booking.dto.BookingRequestDto;
import backend.development.booking.dto.BookingResponseDto;
import backend.development.booking.model.Booking;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookingMapper {

    BookingResponseDto toDto(Booking booking);

    Booking toModel(BookingRequestDto bookingRequestDto);

    List<BookingResponseDto> toDtos(List<Booking> bookings);
}
