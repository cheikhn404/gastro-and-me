package sn.atos.gastro_and_me.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.atos.gastro_and_me.entities.RestaurantEntity;

/**
 *
 * @author rubix
 */
@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {
    
}
