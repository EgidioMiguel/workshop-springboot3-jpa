package com.aulaudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaudemy.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
