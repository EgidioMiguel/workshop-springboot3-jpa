package com.aulaudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaudemy.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
