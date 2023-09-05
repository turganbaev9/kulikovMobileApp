package kg.mega.kulikovmobileapp.controller;

import kg.mega.kulikovmobileapp.model.Basket;
import kg.mega.kulikovmobileapp.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/basket")
@RequiredArgsConstructor
public class BasketController {
    private final BasketService basketService;

    @PostMapping("/save")
    public Basket save(@RequestBody Basket basket){
        return basketService.save(basket);
    }
}
