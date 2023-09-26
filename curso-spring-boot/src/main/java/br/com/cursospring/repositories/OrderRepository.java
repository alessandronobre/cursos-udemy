package br.com.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cursospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
