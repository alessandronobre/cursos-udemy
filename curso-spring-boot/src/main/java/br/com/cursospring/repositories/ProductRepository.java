package br.com.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cursospring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
