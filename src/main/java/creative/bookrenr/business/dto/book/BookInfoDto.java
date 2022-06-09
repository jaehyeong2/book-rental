package creative.bookrenr.business.dto.book;

import creative.bookrenr.business.domain.book.Book;
import creative.bookrenr.business.domain.book.BookInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BookInfoDto {
    private String title;
    private String author;
    private String isbn; //고유 번호
    private Long categoryId;
    private Long publisherId;

    public BookInfoDto(BookInfo bookInfo) {
        this.title = bookInfo.getTitle();
        this.author = bookInfo.getAuthor();
        this.isbn = bookInfo.getIsbn();
    }
}
