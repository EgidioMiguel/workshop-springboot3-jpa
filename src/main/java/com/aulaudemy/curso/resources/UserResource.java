package com.aulaudemy.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaudemy.curso.entities.User;
import com.aulaudemy.curso.services.UserService;

@RestController //Combina @Controller e @ResponseBody. Retorna JSON diretamente.
@RequestMapping(value = "/users") //Mapeia qualquer tipo de requisição para métodos ou classes.
public class UserResource {
	
	@Autowired
	private UserService service;
	
	//ResponseEntity<T> exclusivo do spring, serve para retorna resposta da web
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		List<User> list =  service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		
		User obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
}
