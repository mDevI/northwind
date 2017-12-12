package com.mdevi.northwind.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class HomeController {

    @RequestMapping("/welcome")
    public String userForm(Locale locale, Model model) {

        model.addAttribute("user", "One world");
        model.addAttribute("users", "One decision");

        return "welcome";
    }
}
