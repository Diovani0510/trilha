package com.trilha.diovani.trilha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class StartController {

    @GetMapping("/world")
    public String helloWorld() {
        return "Sucesso!";
    }
}
