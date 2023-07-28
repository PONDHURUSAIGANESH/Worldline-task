package com.student.registration.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HTMLcontroller {
    @GetMapping("/")
    public String index(){
        return "student";
    }

    @GetMapping("/data")
    public String data(){
        return "data";
    }
}
