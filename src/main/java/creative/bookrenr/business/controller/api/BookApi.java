package creative.bookrenr.business.controller.api;

import creative.bookrenr.business.dto.ResDto;
import creative.bookrenr.business.dto.book.BookInfoDto;
import creative.bookrenr.business.service.BookService;
import creative.bookrenr.global.dto.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BookApi {
    private final BookService bookService;

    @PostMapping("/api/book")
    public ApiResponse<String> save(@RequestBody BookInfoDto dto){
        return new ApiResponse<>(bookService.save(dto));
    }

    @DeleteMapping("/admin/book/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        return new ResponseEntity<>(new ResDto<>("책 삭제 완료",id),HttpStatus.OK);
    }
}
