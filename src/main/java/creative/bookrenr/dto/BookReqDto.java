package creative.bookrenr.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookReqDto {
    private String title;
    private String author;
    private String isbn; //고유 번호
    private String publisher; //출판사
}
