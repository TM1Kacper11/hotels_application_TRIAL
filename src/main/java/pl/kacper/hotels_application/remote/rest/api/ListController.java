package pl.kacper.hotels_application.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kacper.hotels_application.remote.rest.dto.response.ListDto;
import pl.kacper.hotels_application.remote.rest.dto.response.HotelDto;
import pl.kacper.hotels_application.remote.rest.dto.response.BedDto;

import java.math.BigDecimal;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RequestMapping(value ="/api/v1/menu", produces = APPLICATION_JSON_VALUE)
@RestController


public class ListController {
}



public class MenuController {

    public ResponseEntity<ListDto> getList(){
        BedDto bedDto = new BedDto(1, .5, BigDecimal.valueOf(100.00));
        HotelDto pizzaDto = new HotelDto(1, "Big Hotel", List.of(bedDto));
        ListDto menuDto = new ListDto(List.of(hotelDto));

        return ResponseEntity.ok(listDto);

    }
}