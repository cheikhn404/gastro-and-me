package sn.atos.gastro_and_me.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sn.atos.gastro_and_me.entities.RatingEntity;

@Repository
public interface RatingRepository extends JpaRepository<RatingEntity, Long> {
    @Query("SELECT r FROM RatingEntity r where r.comment =:comment")
    int getRestaurantByRaintig(String comment);
}
