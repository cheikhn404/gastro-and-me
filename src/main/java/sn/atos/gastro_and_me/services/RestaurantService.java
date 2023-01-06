package sn.atos.gastro_and_me.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import sn.atos.gastro_and_me.entities.RestaurantEntity;
import sn.atos.gastro_and_me.repositories.RestaurantRepository;

/**
 *
 * @author rubix
 */
@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public RestaurantEntity addRestaurant(RestaurantEntity restaurant) {
        Date date = new Date();
        restaurant.setCreationDate(date);
        return restaurantRepository.save(restaurant);
    }


    public RestaurantEntity editRestaurant(RestaurantEntity restaurant) {

        return null;
    }


    public List<RestaurantEntity> getRestaurants() {
       return restaurantRepository.findAll();
    }


    public RestaurantEntity getRestaurant(Long id) {
        return  restaurantRepository.findById(id).get();
    }


    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }
    
}
