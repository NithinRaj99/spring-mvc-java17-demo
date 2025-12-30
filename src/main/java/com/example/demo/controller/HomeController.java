package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Spring MVC JSP Demo");
        model.addAttribute("message", "Built with Java 17 & Maven 3.6");
        return "home";
    }
}