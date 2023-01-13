package sn.atos.gastro_and_me.services;

import org.springframework.stereotype.Service;
import sn.atos.gastro_and_me.dto.RatingDTO;
import sn.atos.gastro_and_me.entities.RatingEntity;
import sn.atos.gastro_and_me.mappers.RatingMapper;
import sn.atos.gastro_and_me.repositories.RatingRepository;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService{
    private final RatingRepository ratingRepository;
    private  final RatingMapper ratingMapper;

    public RatingServiceImpl(RatingRepository ratingRepository, RatingMapper ratingMapper) {
        this.ratingRepository = ratingRepository;
        this.ratingMapper = ratingMapper;
    }

    @Override
    public RatingDTO addRating(RatingDTO ratingDTO) {
        // Conversion de l'objet dto en entité
        RatingEntity ratingEntity = ratingMapper.toEntity(ratingDTO);
        // Sauvegarde de l'objet entité dans la BDD
        RatingEntity ratingEntitySaved = ratingRepository.save(ratingEntity);
        // Conversion de l'entité en objet dto
        RatingDTO ratingDTOtoUser = ratingMapper.toDto(ratingEntitySaved);
        // Retourne l'objet dto à l'utilisateur
        return ratingDTOtoUser;
    }

    @Override
    public RatingEntity editRating(RatingEntity rating) {
        return null;
    }

    @Override
    public List<RatingDTO> getRatings() {
        // Recupération des entités depuis la BDD
        List<RatingEntity> ratingEntities =  ratingRepository.findAll();
        // Mappage des entités en DTO
        List<RatingDTO> ratingDtos = ratingMapper.toDtos(ratingEntities);
        // On retourne les DTO à l'utilisateur
        return ratingDtos;
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
