package backend.development.booking.service;

import backend.development.booking.dto.AccommodationRequestDto;
import backend.development.booking.dto.AccommodationResponseDto;

public interface AccommodationService {

    AccommodationResponseDto findById(Long id);

    AccommodationResponseDto save(AccommodationRequestDto requestDto);

}
