package creative.bookrenr.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String password;

    @OneToMany(mappedBy = "user")
    public List<Rent> rentList = new ArrayList<>();

}
