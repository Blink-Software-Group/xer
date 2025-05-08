package com.api.xer.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.xer.models.Usuario;
import com.api.xer.services.UserService;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UserService userService;

    @GetMapping("/")
    public ArrayList<Usuario> usuarios() {
        return userService.getUsuarios();
    }
    
    @PostMapping("/")
    public Usuario saveUer(Usuario user) {
    	
    	return userService.saveUser(user);
    }

 
 
}