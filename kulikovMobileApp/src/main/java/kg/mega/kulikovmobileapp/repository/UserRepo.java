package kg.mega.kulikovmobileapp.repository;

import kg.mega.kulikovmobileapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

    List<User> findAllByEmail(String email);

}
