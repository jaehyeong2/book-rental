package creative.bookrenr.business.domain.book;

import lombok.*;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class Book{
    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private BookInfo bookInfo;

    @Enumerated(value = EnumType.STRING)
    public RentStatus rentStatus; //RENTED, NOT

    public void rentBook() {
        this.rentStatus = RentStatus.RENTED;
    }

    // 같은 isbn의 책이 여러권 있을 때?? -> book이랑 book info 테이블을 나누는게 맞을까?
}
