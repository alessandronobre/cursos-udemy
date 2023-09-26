package br.com.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cursospring.entities.OrderItem;
import br.com.cursospring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}