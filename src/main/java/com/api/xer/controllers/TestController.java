package com.api.xer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TestController {


    @GetMapping("/hola")
    public String saludar() {
        return "¡Hola mundo desde Spring Boot!";
    }

 
    @GetMapping("/nombres")
    public List<String> listarNombres() {
        return List.of("Lucas", "Ana", "Marcos", "Sofía");
    }
}