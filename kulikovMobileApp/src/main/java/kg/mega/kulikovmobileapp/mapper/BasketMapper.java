package kg.mega.kulikovmobileapp.mapper;

import kg.mega.kulikovmobileapp.model.Basket;
import kg.mega.kulikovmobileapp.model.dto.BasketDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BasketMapper {
    Basket toEntity(BasketDTO basketDto);
    BasketDTO toDto(Basket basket);
}
