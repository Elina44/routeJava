package com.wildcodeschool.challenge01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DoctorController {

    @GetMapping("/index")//route
    public String index() {
        return "/index.html";
        //lien vers une nvelle adresse
    }

    @GetMapping("/doctor/1")//route
    public String william() {
        return "/william.html";
        //lien vers une nvelle adresse
    }

    @GetMapping("/doctor/10")//route
    public String david() {
        return "/david.html";
    }

    @GetMapping("/doctor/13")//route
    public String jodie() {
        return "/jodie.html";
    }

}
