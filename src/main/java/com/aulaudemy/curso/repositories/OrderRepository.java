package com.aulaudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaudemy.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
