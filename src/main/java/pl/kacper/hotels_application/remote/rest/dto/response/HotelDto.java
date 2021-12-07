package pl.kacper.hotels_application.remote.rest.dto.response;

import java.util.List;

public class HotelDto {

    private Integer id;
    private String name;


    public HotelDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
