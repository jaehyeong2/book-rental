package creative.bookrenr.business.domain.rent;

import creative.bookrenr.business.domain.user.User;
import creative.bookrenr.business.domain.book.Book;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    public User user;

    @JoinColumn(name = "board_id")
    @OneToOne(fetch = FetchType.LAZY)
    public Book book;

}
