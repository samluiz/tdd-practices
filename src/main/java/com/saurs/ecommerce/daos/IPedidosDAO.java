package com.saurs.ecommerce.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurs.ecommerce.models.Pedido;

public interface IPedidosDAO extends JpaRepository<Pedido, Integer> {
  
}
