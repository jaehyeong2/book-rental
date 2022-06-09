package creative.bookrenr.business.domain.user;

import creative.bookrenr.business.domain.rent.Rent;
import creative.bookrenr.business.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String phone;
    private String password;
    
    @Comment("대여 권수")
    private int rentCount;

    @ElementCollection(fetch = FetchType.EAGER)
    @Builder.Default
    private List<String> roles = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    public List<Rent> rentList = new ArrayList<>();

    protected User() {
    }
}
