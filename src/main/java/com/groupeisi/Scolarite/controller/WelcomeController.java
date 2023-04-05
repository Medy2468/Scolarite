package com.groupeisi.Scolarite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/home")
    public String home() {

        return "home";
    }
}
