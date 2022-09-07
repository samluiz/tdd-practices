package com.saurs.ecommerce.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientesTests {

	@Test
	void validarAtributos() {
		var cliente = new Cliente();
		
		cliente.setNome("Samuel");
		cliente.setEmail("samuel@email.com");
		cliente.setSenha("123");
		cliente.setEndereco("Rua 1, Machado 98, Dona Lindu");

		assertEquals("Samuel", cliente.getNome());
		assertEquals("samuel@email.com", cliente.getEmail());
		assertEquals("123", cliente.getSenha());
		assertEquals("Rua 1, Machado 98, Dona Lindu", cliente.getEndereco());
	}

}
