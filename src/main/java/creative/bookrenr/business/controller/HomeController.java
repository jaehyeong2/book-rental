package creative.bookrenr.business.controller;

import creative.bookrenr.business.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class HomeController {

    private final BookService bookService;

    @GetMapping({"/","/home"})
    public String home(Model model){
        model.addAttribute("books",bookService.getAllBooks());
        return "home";
    }

    @GetMapping("/signin")
    public String signinForm(){
        return "signin";
    }

    @GetMapping("/signup")
    public String signupForm(){
        return "signup";
    }
}
