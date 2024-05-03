package backend.development.booking.mapper;

import backend.development.booking.dto.BookingRequestDto;
import backend.development.booking.dto.BookingResponseDto;
import backend.development.booking.model.Booking;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper
public interface BookingMapper {
    BookingResponseDto toDto(Booking booking);
    Booking toModel(BookingRequestDto bookingRequestDto);
    List<BookingResponseDto> toDtos(List<Booking> bookings);
}
