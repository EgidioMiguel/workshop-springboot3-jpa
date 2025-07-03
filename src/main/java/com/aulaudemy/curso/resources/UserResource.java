package com.aulaudemy.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaudemy.curso.entities.User;

@RestController //Combina @Controller e @ResponseBody. Retorna JSON diretamente.
@RequestMapping(value = "/users") //Mapeia qualquer tipo de requisição para métodos ou classes.
public class UserResource {

	
	//ResponseEntity<T> exclusivo do spring, serve para retorna resposta da web
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "1234");
		return ResponseEntity.ok().body(u);
	}
	
}
