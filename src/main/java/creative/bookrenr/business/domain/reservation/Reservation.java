package creative.bookrenr.business.domain.reservation;

import creative.bookrenr.business.domain.BaseTimeEntity;
import creative.bookrenr.business.domain.book.Book;
import creative.bookrenr.business.domain.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

@Table(name = "reservations")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class Reservation extends BaseTimeEntity {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Book book;
    
    @Comment("예약순번")
    private int turn;
}
