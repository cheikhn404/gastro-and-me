package sn.atos.gastro_and_me.services;

import java.util.List;
import sn.atos.gastro_and_me.entities.RestaurantEntity;

/**
 *
 * @author rubix
 */
public interface RestaurantService {
    
    RestaurantEntity addRestaurant(RestaurantEntity restaurant);
    
    RestaurantEntity editRestaurant(RestaurantEntity restaurant);
    
    List<RestaurantEntity> getRestaurants();
    
    RestaurantEntity getRestaurant(Long id);
    
    void deleteRestaurant(Long id);
}
