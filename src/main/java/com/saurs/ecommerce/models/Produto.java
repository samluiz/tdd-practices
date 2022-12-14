package com.saurs.ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String nome;
  private String descricao;
  private Double valor;
  private int quantidade;
  private String codigo;

  public String getNome() {
    return nome;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  public void setNome(String nome) {
    this.nome = nome;
    if (this.codigo == null || this.codigo.isEmpty()) {
      this.codigo = this.nome.substring(0, 3).toUpperCase() + "-" + this.nome.length();
    }
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public Double getValor() {
    return valor;
  }
  public void setValor(Double valor) {
    this.valor = valor;
  }
  public int getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
  public String getCodigo() {
    return codigo;
  }

  
}
