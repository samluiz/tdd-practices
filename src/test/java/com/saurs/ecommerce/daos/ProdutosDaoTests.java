package com.saurs.ecommerce.daos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutosDaoTests {

  @Autowired
  private IProdutosDAO produtosDao;

  @BeforeEach
  void resetDatabase() {
    produtosDao.deleteAll();
  }

  @Test
  void validarFindDoDaoCliente() {
    var produtos = produtosDao.findAll();

    assertEquals(0, produtos.size());

  }
  
}
