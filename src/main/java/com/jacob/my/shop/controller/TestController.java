package com.jacob.my.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String sayHi(Model model) {
        model.addAttribute("user", "user");
        return "index";
    }
}
