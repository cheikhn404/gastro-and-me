package sn.atos.gastro_and_me.services;

import sn.atos.gastro_and_me.entities.RatingEntity;

import java.util.List;

public interface RatingService {
    RatingEntity addRating(RatingEntity rating);

    RatingEntity editRating(RatingEntity rating);

    List<RatingEntity> getRatings();

    RatingEntity getRating(Long id);

    void deleteRating(Long id);
}
