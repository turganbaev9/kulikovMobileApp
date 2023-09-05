package kg.mega.kulikovmobileapp.service.impl;

import kg.mega.kulikovmobileapp.mapper.UserMapper;
import kg.mega.kulikovmobileapp.model.User;
import kg.mega.kulikovmobileapp.model.dto.UserBasketDTO;
import kg.mega.kulikovmobileapp.model.dto.UserRqDTO;
import kg.mega.kulikovmobileapp.model.dto.UserRsDTO;
import kg.mega.kulikovmobileapp.repository.UserRepo;
import kg.mega.kulikovmobileapp.service.BasketService;
import kg.mega.kulikovmobileapp.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final UserMapper userMapper;
    private final BasketService basketService;
    @Override
    public User saveUser(User user) {

        return userRepo.save(user);
    }

    @Override
    public User updateUser(User user) {
        User updatedUser = userRepo.findById(user.getId()).get();
        updatedUser.setPhone(user.getPhone());
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setEmail(user.getEmail());
        return updatedUser;
    }

    @Override
    public List<UserRsDTO> showUserList() {
        return userMapper.toDtoList(userRepo.findAll());
    }

    @Override
    public ResponseEntity<?> saveUserAndBasket(UserBasketDTO dto) {
        userRepo.save(dto.getUser());
        UserBasketDTO userBasketDTO = new UserBasketDTO();
        userBasketDTO.setUser(userRepo.save(dto.getUser()));
        userBasketDTO.setBasket(basketService.save(dto.getBasket()));
        return ResponseEntity.ok(userBasketDTO);
    }


}
