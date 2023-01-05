package sn.atos.gastro_and_me.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.atos.gastro_and_me.entities.RatingEntity;

@Repository
public interface RatingRepository extends JpaRepository<RatingEntity, Long> {
}
