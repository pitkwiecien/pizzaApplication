package pl.piotrkwiecien.pizzaapplication.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.piotrkwiecien.pizzaapplication.remote.rest.dto.response.MenuDto;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/menu", produces = APPLICATION_JSON_VALUE)
@RestController
public class MenuController {
    @GetMapping
    public ResponseEntity<MenuDto> getMenu() {
        return ResponseEntity.ok(null);
    }
}
