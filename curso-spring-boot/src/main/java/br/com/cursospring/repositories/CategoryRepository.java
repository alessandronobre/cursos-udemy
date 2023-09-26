package br.com.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cursospring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
