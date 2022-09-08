package com.saurs.ecommerce.daos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClientesDaoTests {

  @Autowired
  private IClientesDAO clienteDao;

  @BeforeEach
  void resetDatabase() {
    clienteDao.deleteAll();
  }

  @Test
  void validarFindDoDaoCliente() {
    var clientes = clienteDao.findAll();

    assertEquals(0, clientes.size());

  }
  
}
