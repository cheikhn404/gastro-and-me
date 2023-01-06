package sn.atos.gastro_and_me.controllers;

import java.util.Date;
import java.util.List;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sn.atos.gastro_and_me.entities.RestaurantEntity;
import sn.atos.gastro_and_me.services.RestaurantService;

/**
 *
 * @author rubix
 */
@RestController
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }
    
    @PostMapping("/restaurants")
    public RestaurantEntity addRestaurant(@RequestBody @Valid RestaurantEntity restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }
    
    @GetMapping("/restaurants")
    public List<RestaurantEntity> getRestaurants() {
        return restaurantService.getRestaurants();
    }
    
    @GetMapping("/restaurants/{id}")
    public RestaurantEntity getRestaurant(@PathVariable Long id) {
        return restaurantService.getRestaurant(id);
    }
    
    @DeleteMapping("/restaurants/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);
    }

}
