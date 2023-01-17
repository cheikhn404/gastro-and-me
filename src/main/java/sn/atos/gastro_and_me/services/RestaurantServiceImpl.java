package sn.atos.gastro_and_me.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import sn.atos.gastro_and_me.dto.RestaurantDTO;
import sn.atos.gastro_and_me.entities.RestaurantEntity;
import sn.atos.gastro_and_me.exceptions.ResourceNotFoundException;
import sn.atos.gastro_and_me.mappers.RestaurantMapper;
import sn.atos.gastro_and_me.repositories.RestaurantRepository;

/**
 * @author rubix
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepository restaurantRepository;

    private final RestaurantMapper restaurantMapper;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository, RestaurantMapper restaurantMapper) {
        this.restaurantRepository = restaurantRepository;
        this.restaurantMapper = restaurantMapper;
    }

    @Override
    public RestaurantDTO addRestaurant(RestaurantDTO restaurantDTO) {
        // Conversion automatique de dto en entité
        RestaurantEntity restaurantEntity = restaurantMapper.toEntity(restaurantDTO);
        // Sauvegarde du restaurant entité au niveau de la BDD
        RestaurantEntity restaurantEntityCreated = restaurantRepository.save(restaurantEntity);
        // Conversion automatique de entité en dto
        RestaurantDTO restaurantDTO1 = restaurantMapper.toDto(restaurantEntityCreated);
        // On retourne de dto crée
        return restaurantDTO1;
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
        Optional<RestaurantEntity> optionalRestaurant = restaurantRepository.findById(id);
        if (!optionalRestaurant.isPresent()){
           throw new ResourceNotFoundException("Restaurant with id = "+id+" not found");
        }
        return optionalRestaurant.get();
    }

    @Override
    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }

}
