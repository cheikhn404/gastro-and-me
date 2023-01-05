package sn.atos.gastro_and_me.services;

import org.springframework.stereotype.Service;
import sn.atos.gastro_and_me.entities.RatingEntity;
import sn.atos.gastro_and_me.repositories.RatingRepository;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService{
    private final RatingRepository ratingRepository;

    public RatingServiceImpl(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @Override
    public RatingEntity addRating(RatingEntity rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public RatingEntity editRating(RatingEntity rating) {
        return null;
    }

    @Override
    public List<RatingEntity> getRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public RatingEntity getRating(Long id) {
        return ratingRepository.findById(id).get();
    }

    @Override
    public void deleteRating(Long id) {
        ratingRepository.deleteById(id);
    }
}
