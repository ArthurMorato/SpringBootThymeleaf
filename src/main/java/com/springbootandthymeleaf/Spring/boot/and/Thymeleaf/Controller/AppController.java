package com.springbootandthymeleaf.Spring.boot.and.Thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    @GetMapping({"/","/index.html"})
    public String index(@RequestParam(value = "name", defaultValue = "Arthur") String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }

}
