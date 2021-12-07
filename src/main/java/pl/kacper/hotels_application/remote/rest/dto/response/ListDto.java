package pl.kacper.hotels_application.remote.rest.dto.response;

import java.util.List;

public class ListDto {
    private List<HotelDto> hotels;

    public ListDto(List<HotelDto> hotels) {
        this.hotels = hotels;
    }

    public List<HotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDto> hotels) {
        this.hotels = hotels;
    }
}
