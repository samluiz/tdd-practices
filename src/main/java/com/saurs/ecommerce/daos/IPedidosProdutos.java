package com.saurs.ecommerce.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurs.ecommerce.models.PedidoProduto;

public interface IPedidosProdutos extends JpaRepository<PedidoProduto, Integer> {
  
}
