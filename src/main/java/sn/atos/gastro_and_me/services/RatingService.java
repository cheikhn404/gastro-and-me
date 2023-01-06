package sn.atos.gastro_and_me.services;

import org.springframework.stereotype.Service;
import sn.atos.gastro_and_me.entities.RatingEntity;
import sn.atos.gastro_and_me.repositories.RatingRepository;

import java.util.List;

@Service
public class RatingService {
    private final RatingRepository ratingRepository;

    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }


    public RatingEntity addRating(RatingEntity rating) {
        return ratingRepository.save(rating);
    }

    public RatingEntity editRating(RatingEntity rating) {
        return null;
    }


    public List<RatingEntity> getRatings() {
        return ratingRepository.findAll();
    }


    public RatingEntity getRating(Long id) {
        return ratingRepository.findById(id).get();
    }


    public void deleteRating(Long id) {
        ratingRepository.deleteById(id);
    }
}
