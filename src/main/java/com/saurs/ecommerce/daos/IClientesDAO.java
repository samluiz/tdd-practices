package com.saurs.ecommerce.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saurs.ecommerce.models.Cliente;

@Repository
public interface IClientesDAO extends JpaRepository<Cliente, Integer>  {
}
