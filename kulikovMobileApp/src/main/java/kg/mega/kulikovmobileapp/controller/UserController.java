package kg.mega.kulikovmobileapp.controller;

import kg.mega.kulikovmobileapp.model.User;
import kg.mega.kulikovmobileapp.model.dto.UserBasketDTO;
import kg.mega.kulikovmobileapp.model.dto.UserRqDTO;
import kg.mega.kulikovmobileapp.model.dto.UserRsDTO;
import kg.mega.kulikovmobileapp.repository.UserRepo;
import kg.mega.kulikovmobileapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserRepo userRepo;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @PutMapping("/updateUser")
    public User update(@RequestBody User user){
        return userService.updateUser(user);
    }

    @GetMapping("/findAll")
    public List<UserRsDTO> findAll(){
        return userService.showUserList();
    }
    @PostMapping("/saveUserAndBasket")
    public ResponseEntity<?> saveUserAndBasket(@RequestBody UserBasketDTO dto){
       return userService.saveUserAndBasket(dto);
    }
    @GetMapping("/byEmail")
    public List<User> byEmail(@RequestParam String email){
        return userRepo.findAllByEmail(email);
    }
}
