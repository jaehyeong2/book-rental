package creative.bookrenr.business.controller;

import creative.bookrenr.business.domain.book.Book;
import creative.bookrenr.business.dto.book.BookInfoDto;
import creative.bookrenr.business.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Controller
public class BookController {
    private final BookService bookService;

    @GetMapping("/admin")
    public String admin(Model model){
        model.addAttribute("books",bookService.getAllBooks());
        return "admin";
    }

    @GetMapping("/admin/book")
    public String bookAdd(Model model){
        model.addAttribute("bookReqDto", new BookInfoDto());
        return "booksAdd";
    }

//    @DeleteMapping("/admin/book/{id}")
//    public String deleteById(@PathVariable Long id){
//        bookService.deleteById(id);
//        return "redirect:/admin";
//    }
}
