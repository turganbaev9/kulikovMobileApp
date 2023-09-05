package kg.mega.kulikovmobileapp.mapper.impl;

import kg.mega.kulikovmobileapp.mapper.BasketMapper;
import kg.mega.kulikovmobileapp.model.Basket;
import kg.mega.kulikovmobileapp.model.dto.BasketDTO;

public class BasketMapperImpl implements BasketMapper {
    @Override
    public Basket toEntity(BasketDTO basketDto) {
        if(basketDto==null){
            return null;
        }
        Basket basket = new Basket();
        basket.setId(basketDto.getId());
        basket.setCreatedDate(basketDto.getCreatedDate());
        return basket;
    }

    @Override
    public BasketDTO toDto(Basket basket) {
        if(basket==null){
            return null;
        }
        BasketDTO basketDto = new BasketDTO();
        basketDto.setId(basket.getId());
        basketDto.setCreatedDate(basket.getCreatedDate());
        return basketDto;
    }
}
