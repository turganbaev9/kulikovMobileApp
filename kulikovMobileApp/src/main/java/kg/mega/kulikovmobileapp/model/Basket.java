package kg.mega.kulikovmobileapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_basket")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate createdDate;
    @OneToOne(mappedBy = "basket",cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> productList;
}
