package creative.bookrenr.business.domain.book;

import creative.bookrenr.business.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class BookInfo extends BaseTimeEntity {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @Comment("출판사")
    @ManyToOne(fetch = FetchType.LAZY)
    private Publisher publisher;

    private String title;
    private String author;
    @Comment("고유번호")
    private String isbn;

}
