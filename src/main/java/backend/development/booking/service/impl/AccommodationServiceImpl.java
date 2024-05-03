package backend.development.booking.service.impl;

import backend.development.booking.dto.AccommodationRequestDto;
import backend.development.booking.dto.AccommodationResponseDto;
import backend.development.booking.mapper.AccommodationMapper;
import backend.development.booking.model.Accommodation;
import backend.development.booking.model.Address;
import backend.development.booking.repository.AccommodationRepository;
import backend.development.booking.repository.AddressRepository;
import backend.development.booking.service.AccommodationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccommodationServiceImpl implements AccommodationService {
    private final AccommodationRepository accommodationRepository;
    private final AccommodationMapper accommodationMapper;
    private final AddressRepository addressRepository;

    @Override
    public AccommodationResponseDto findById(Long id) {

        return null;
    }

    @Override
    public AccommodationResponseDto save(AccommodationRequestDto requestDto) {
        Address saveAddress = addressRepository.save(requestDto.getAddress());
        Accommodation accommodation = accommodationMapper.toModel(requestDto);
        accommodation.setAddress(saveAddress);

        AccommodationResponseDto responseDto = accommodationMapper.toDto(accommodationRepository.save(accommodation));
        return responseDto;
    }
}
