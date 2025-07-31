package com.aulaudemy.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaudemy.curso.entities.Product;
import com.aulaudemy.curso.services.ProductService;

@RestController //Combina @Controller e @ResponseBody. Retorna JSON diretamente.
@RequestMapping(value = "/products") //Mapeia qualquer tipo de requisição para métodos ou classes.
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	//ResponseEntity<T> exclusivo do spring, serve para retorna resposta da web
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		
		List<Product> list =  service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		
		Product obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
}
