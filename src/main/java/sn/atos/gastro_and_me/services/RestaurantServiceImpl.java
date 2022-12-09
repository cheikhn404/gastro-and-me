package sn.atos.gastro_and_me.services;

import java.util.List;
import org.springframework.stereotype.Service;
import sn.atos.gastro_and_me.entities.RestaurantEntity;
import sn.atos.gastro_and_me.repositories.RestaurantRepository;

/**
 *
 * @author rubix
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantReposotory) {
        this.restaurantRepository = restaurantReposotory;
    }

    @Override
    public RestaurantEntity addRestaurant(RestaurantEntity restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public RestaurantEntity editRestaurant(RestaurantEntity restaurant) {
        return null;
    }

    @Override
    public List<RestaurantEntity> getRestaurants() {
       return restaurantRepository.findAll();
    }

    @Override
    public RestaurantEntity getRestaurant(Long id) {
        RestaurantEntity restaurantEntity = restaurantRepository.getOne(id);
        System.out.println(restaurantEntity.toString());
        return restaurantEntity;
    }

    @Override
    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }
    
}
