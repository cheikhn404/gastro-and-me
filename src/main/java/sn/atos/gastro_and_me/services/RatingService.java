package sn.atos.gastro_and_me.services;

import sn.atos.gastro_and_me.dto.RatingDTO;
import sn.atos.gastro_and_me.entities.RatingEntity;

import java.util.List;

public interface RatingService {
    RatingDTO addRating(RatingDTO ratingDTO);

    RatingEntity editRating(RatingEntity rating);

    List<RatingDTO> getRatings();

    RatingEntity getRating(Long id);

    void deleteRating(Long id);
}
