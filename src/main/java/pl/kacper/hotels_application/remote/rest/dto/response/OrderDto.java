package pl.kacper.hotels_application.remote.rest.dto.response;

import pl.kacper.hotels_application.domain.model.OrderStatusType;
import pl.kacper.hotels_application.remote.rest.common.HotelOrderDto;
import pl.kacper.hotels_application.remote.rest.common.PersonOrderDto;
import pl.kacper.hotels_application.remote.rest.common.HotelOrderDto;

import java.util.List;


public class OrderDto {
    private List<HotelOrderDto> hotels;
    private Integer id;
    private OrderStatusType status;
    private List<HotelOrderDto> pizzas;
    private PersonOrderDto person;

    public OrderDto(Integer id, OrderStatusType status, List<HotelOrderDto> hotels, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.hotels = hotels;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<HotelOrderDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelOrderDto> pizzas) {
        this.hotels = hotels;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}