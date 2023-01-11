package sn.atos.gastro_and_me.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.atos.gastro_and_me.entities.RestaurantEntity;

import java.util.List;

/**
 *
 * @author rubix
 */
@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {
    @Override
    List<RestaurantEntity> findAll();
    String getRestaurantEntitiesByAddress();
}
