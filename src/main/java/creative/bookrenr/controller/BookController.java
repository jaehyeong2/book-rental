package creative.bookrenr.controller;

import creative.bookrenr.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class BookController {
    private final BookService bookService;

    @GetMapping("/admin")
    public String admin(Model model){
        model.addAttribute("books",bookService.getAllBooks());
        return "admin";
    }
}
