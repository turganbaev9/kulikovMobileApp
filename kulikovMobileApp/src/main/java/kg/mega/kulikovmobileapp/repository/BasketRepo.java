package kg.mega.kulikovmobileapp.repository;

import kg.mega.kulikovmobileapp.model.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepo extends JpaRepository<Basket,Long> {
}
