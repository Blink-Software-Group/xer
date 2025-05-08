package com.api.xer.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.xer.models.Usuario;
import com.api.xer.repositories.IUserRepository;

@Service
public class UserService {

	
	@Autowired
	IUserRepository userRepository;
	
	
	
	public ArrayList<Usuario> getUsuarios(){
		return (ArrayList<Usuario> )userRepository.findAll();
	}
	
	
	public Usuario saveUser(Usuario user){
		
		return userRepository.save(user);
		 
	}
	
}
