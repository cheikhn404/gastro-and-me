package sn.atos.gastro_and_me.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import sn.atos.gastro_and_me.dto.RatingDTO;
import sn.atos.gastro_and_me.entities.RatingEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RatingMapper {
    @Mapping(source = "restaurantId", target= "restaurant.id")
    RatingEntity toEntity(RatingDTO ratingDTO);

    @Mapping(source = "restaurant.id", target= "restaurantId")
    RatingDTO toDto(RatingEntity ratingEntity);

    List<RatingDTO> toDtos(List<RatingEntity> ratingEntities);

    List<RatingEntity> toEntities(List<RatingDTO> ratingDtos);
}
