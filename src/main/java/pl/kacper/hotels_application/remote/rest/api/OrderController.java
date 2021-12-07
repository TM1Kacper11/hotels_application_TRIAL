package pl.kacper.hotels_application.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kacper.hotels_application..remote.rest.dto.request.AddPizzaDto;
import pl.kacper.hotels_application.
import pl.kacper.hotels_application.remote.rest.dto.request.AddHotelDto;
import pl.kacper.hotels_application.remote.rest.dto.response.HotelDto;.remote.rest.dto.response.PizzaDto;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/hotels", produces = APPLICATION_JSON_VALUE)
@RestController


public class OrderController {

    @PostMapping
    public ResponseEntity<HotelDto> addHotel(@RequestBody AddHotelDto addPizzaDto,
                                             @RequestHeader("Access-Token") String token) {
        return ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HotelDto> updateHotel(@RequestBody AddHotelDto addHotelDto,
                                                @RequestHeader("Access-Token") String token,
                                                @PathVariable("id") Integer hotelId){

        return ResponseEntity.ok(null);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHotel(@RequestHeader("Access-Token") String token,
                                            @PathVariable("id") Integer hotelId){

        return ResponseEntity.ok(). build();
    }

}
