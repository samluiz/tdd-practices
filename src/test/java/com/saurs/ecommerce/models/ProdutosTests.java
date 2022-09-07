package com.saurs.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutosTests {

  @Test
  void validarAtributos() {
    
    var produto = new Produto();
  
    produto.setNome("Memória");
    produto.setDescricao("RAM");
    produto.setValor(350.00);
    produto.setQuantidade(20);
  
    assertEquals("Memória", produto.getNome());
    assertEquals("RAM", produto.getDescricao());
    assertEquals(350.00, produto.getValor());
    assertEquals(20, produto.getQuantidade());
  }

  @Test
	void geraCodigoAoSetarNome(){
		var produto = new Produto();
		produto.setNome("Bicicleta");
	
		assertEquals("BIC-9", produto.getCodigo());
	}
  
  @Test
  void geraCodigoManualmente() {
    var produto = new Produto();
    produto.setCodigo("ABC-123");
    produto.setNome("Bicicleta");

    assertEquals("ABC-123", produto.getCodigo());
  }

}
