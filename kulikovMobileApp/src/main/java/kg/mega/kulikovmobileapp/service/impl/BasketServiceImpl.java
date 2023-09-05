package kg.mega.kulikovmobileapp.service.impl;

import kg.mega.kulikovmobileapp.model.Basket;
import kg.mega.kulikovmobileapp.repository.BasketRepo;
import kg.mega.kulikovmobileapp.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BasketServiceImpl implements BasketService {
    private final BasketRepo basketRepo;
    @Override
    public Basket save(Basket basket) {
        return basketRepo.save(basket);
    }


}
