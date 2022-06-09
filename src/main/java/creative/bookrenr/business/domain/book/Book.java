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

    private String title;
    private String author;
    @Comment("고유번호")
    private String isbn;

    @Comment("출판사")
    private String publisher;

    @Enumerated(value = EnumType.STRING)
    public RentStatus rentStatus; //RENTED, NOT

}
