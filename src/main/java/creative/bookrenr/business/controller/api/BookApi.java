package creative.bookrenr.business.controller.api;

import creative.bookrenr.business.dto.ResDto;
import creative.bookrenr.business.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookApi {
    private final BookService bookService;

//    @PostMapping("/api/book")
//    public ResponseEntity<?> save(Book book){
//        Book saveBook = bookService.save(book);
//        return new ResponseEntity<>(new ResDto<>("책 등록완료",saveBook.getId()),HttpStatus.OK);
//    }

    @DeleteMapping("/admin/book/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        bookService.deleteById(id);
        return new ResponseEntity<>(new ResDto<>("책 삭제 완료",id),HttpStatus.OK);
    }
}
