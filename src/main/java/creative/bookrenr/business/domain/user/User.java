package creative.bookrenr.business.domain.user;

import creative.bookrenr.business.domain.rent.Rent;
import creative.bookrenr.business.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String phone;
    private String password;

    @OneToMany(mappedBy = "user")
    public List<Rent> rentList = new ArrayList<>();

}
