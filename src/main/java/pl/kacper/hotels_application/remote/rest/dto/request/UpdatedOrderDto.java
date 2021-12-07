package pl.kacper.hotels_application.remote.rest.dto.request;


import pl.kacper.hotels_application.domain.model.OrderStatusType;
import pl.kacper.hotels_application.remote.rest.common.PersonOrderDto;
import pl.kacper.hotels_application.remote.rest.common.HotelOrderDto;

import java.util.List;

public class UpdatedOrderDto {


    private OrderStatusType status;
    private List<HotelOrderDto> pizzas;
    private PersonOrderDto person;

    public UpdatedOrderDto(OrderStatusType status, List<HotelOrderDto> pizzas, PersonOrderDto person) {
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<HotelOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<HotelOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}
