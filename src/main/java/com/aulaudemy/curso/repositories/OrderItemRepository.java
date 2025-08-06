package com.aulaudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaudemy.curso.entities.OrderItem;
import com.aulaudemy.curso.entities.pk.OrderitemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderitemPK>{

}
