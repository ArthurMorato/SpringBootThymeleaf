package com.springbootandthymeleaf.Spring.boot.and.Thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    @GetMapping({"/","/index"})
    public String index() {
        return "index";
    }

    @PostMapping("/print")
    public String print(@RequestParam(value = "email", defaultValue = "email") String email,
                        @RequestParam(value = "password", defaultValue = "password") String password, Model model){
        model.addAttribute("email", email);
        model.addAttribute("password", password);
        model.addAttribute("password", password);
        return "print";
    }

}
