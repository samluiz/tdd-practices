package com.saurs.ecommerce.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurs.ecommerce.models.Produto;

public interface IProdutosDAO extends JpaRepository<Produto, Integer> {
  
}
