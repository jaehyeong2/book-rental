package creative.bookrenr.controller;

import creative.bookrenr.domain.Book;
import creative.bookrenr.dto.BookReqDto;
import creative.bookrenr.dto.ResDto;
import creative.bookrenr.enums.RentStatus;
import creative.bookrenr.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
        model.addAttribute("bookReqDto", new BookReqDto());
        return "booksAdd";
    }

    @PostMapping("/admin/book")
    public String save(Book book){
        book.setRentStatus(RentStatus.NOT);
        Book saveBook = bookService.save(book);
        return "redirect:/admin";
    }

//    @DeleteMapping("/admin/book/{id}")
//    public String deleteById(@PathVariable Long id){
//        bookService.deleteById(id);
//        return "redirect:/admin";
//    }
}
