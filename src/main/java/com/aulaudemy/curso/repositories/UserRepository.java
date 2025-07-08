package com.aulaudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaudemy.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
