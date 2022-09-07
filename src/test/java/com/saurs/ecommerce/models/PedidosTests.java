package com.saurs.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PedidosTests {

  @Test
  void validarAtributos() {
    var data = LocalDateTime.now();

    var pedido = new Pedido();

    pedido.setIdCliente(1);
    pedido.setValorTotal(77.77);
    pedido.setData(data);

    assertEquals(1, pedido.getIdCliente());
    assertEquals(77.77, pedido.getValorTotal());
    assertEquals(data, pedido.getData());

  }
  
}
