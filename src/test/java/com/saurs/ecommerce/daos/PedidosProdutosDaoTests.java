package com.saurs.ecommerce.daos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PedidosProdutosDaoTests {

  @Autowired
  private IPedidosProdutos pedidosProdutosDao;

  @BeforeEach
  void resetDatabase() {
    pedidosProdutosDao.deleteAll();
  }

  @Test
  void validarFindDoDaoCliente() {
    var pedidosProdutos = pedidosProdutosDao.findAll();

    assertEquals(0, pedidosProdutos.size());

  }
  
}
