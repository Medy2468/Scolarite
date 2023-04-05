package com.groupeisi.Scolarite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/etudiants")
public class EtudiantController {

    @GetMapping("/list")
    public String list() {

        return "etudiants/list";
    }

    @GetMapping("/add")
    public String add() {

        return "etudiants/add";
    }
}
