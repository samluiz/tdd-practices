package com.saurs.ecommerce.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private int idCliente;
  private double valorTotal;
  private LocalDateTime data;

  public int getIdCliente() {
    return idCliente;
  }
  public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
  }
  public double getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
  }
  public LocalDateTime getData() {
    return data;
  }
  public void setData(LocalDateTime data) {
    this.data = data;
  }

  
}
