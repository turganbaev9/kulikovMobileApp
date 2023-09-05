package kg.mega.kulikovmobileapp.service;

import kg.mega.kulikovmobileapp.model.User;
import kg.mega.kulikovmobileapp.model.dto.UserBasketDTO;
import kg.mega.kulikovmobileapp.model.dto.UserRqDTO;
import kg.mega.kulikovmobileapp.model.dto.UserRsDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User updateUser(User user);
    List<UserRsDTO> showUserList();

    ResponseEntity<?> saveUserAndBasket(UserBasketDTO dto);
}
