package kg.mega.kulikovmobileapp.model.dto;

import lombok.Data;

@Data
public class UserRsDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private BasketDTO basket;
}
