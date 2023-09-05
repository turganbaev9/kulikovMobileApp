package kg.mega.kulikovmobileapp.model.dto;

import kg.mega.kulikovmobileapp.model.Basket;
import kg.mega.kulikovmobileapp.model.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserBasketDTO {
    private User user;
    private Basket basket;
}
