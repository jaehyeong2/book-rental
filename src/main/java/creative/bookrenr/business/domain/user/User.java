package creative.bookrenr.business.domain.user;

import creative.bookrenr.business.domain.rent.Rent;
import creative.bookrenr.business.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String password;
    
    @Comment("대여 권수")
    private int rentCount;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    public List<Rent> rentList = new ArrayList<>();

    @Builder
    public User(String name, String phone, String password, int rentCount, List<String> roles, List<Rent> rentList) {
        super();
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.rentCount = rentCount;
        this.roles = roles;
        this.rentList = rentList;
    }
}
