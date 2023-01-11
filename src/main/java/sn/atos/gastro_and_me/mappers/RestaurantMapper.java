package sn.atos.gastro_and_me.mappers;

import org.mapstruct.Mapper;
import sn.atos.gastro_and_me.dto.RestaurantDTO;
import sn.atos.gastro_and_me.entities.RestaurantEntity;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {
    RestaurantEntity toEntity(RestaurantDTO restaurantDTO);
    RestaurantDTO toDto(RestaurantEntity restaurantEntity);
}
