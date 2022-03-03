package creative.bookrenr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

    @GetMapping({"/","/home"})
    public String home(){
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
