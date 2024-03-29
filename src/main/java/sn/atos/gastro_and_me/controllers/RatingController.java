package sn.atos.gastro_and_me.controllers;

import org.springframework.web.bind.annotation.*;
import sn.atos.gastro_and_me.dto.RatingDTO;
import sn.atos.gastro_and_me.entities.RatingEntity;
import sn.atos.gastro_and_me.services.RatingService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RatingController {
    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping("/ratings")
    public RatingDTO addRating(@RequestBody @Valid RatingDTO ratingDTO) {
        return ratingService.addRating(ratingDTO);
    }

    @GetMapping("/ratings")
    public List<RatingDTO> getRatings() {
        return ratingService.getRatings();
    }

    @GetMapping("/ratings/{id}")
    public RatingEntity getRating(@PathVariable Long id) {
        return ratingService.getRating(id);
    }

    @DeleteMapping("/ratings/{id}")
    public void deleteRatings(@PathVariable Long id) {
        ratingService.deleteRating(id);
    }
}
