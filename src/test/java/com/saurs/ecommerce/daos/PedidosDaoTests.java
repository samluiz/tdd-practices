package com.saurs.ecommerce.daos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PedidosDaoTests {

  @Autowired
  private IPedidosDAO pedidosDao;

  @BeforeEach
  void resetDatabase() {
    pedidosDao.deleteAll();
  }

  @Test
  void validarFindDoDaoCliente() {
    var pedidos = pedidosDao.findAll();

    assertEquals(0, pedidos.size());

  }
  
}
