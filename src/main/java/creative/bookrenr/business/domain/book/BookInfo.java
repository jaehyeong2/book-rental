package creative.bookrenr.business.domain.book;

import creative.bookrenr.business.domain.BaseTimeEntity;
import creative.bookrenr.business.dto.book.BookInfoDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class BookInfo extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Builder
    public BookInfo(Category category, Publisher publisher, String title, String author, String isbn) {
        this.category = category;
        this.publisher = publisher;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static BookInfo create(BookInfoDto dto, Category category, Publisher publisher){
        return builder()
                .category(category)
                .publisher(publisher)
                .title(dto.getTitle())
                .author(dto.getAuthor())
                .isbn(dto.getIsbn())
                .build();
    }
}
