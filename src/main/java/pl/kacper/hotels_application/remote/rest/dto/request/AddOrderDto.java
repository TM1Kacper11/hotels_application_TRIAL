package pl.kacper.hotels_application.remote.rest.dto.request;

import pl.kacper.hotels_application.remote.rest.common.PersonOrderDto;
import pl.kacper.hotels_application.remote.rest.common.HotelOrderDto;

import java.util.List;

public class AddOrderDto {

    private List<HotelOrderDto> pizzas;
    private PersonOrderDto person;

    public AddOrderDto(){
    }

    public AddOrderDto(List<HotelOrderDto> pizzas, PersonOrderDto person) {
        this.pizzas = pizzas;
        this.person = person;
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
