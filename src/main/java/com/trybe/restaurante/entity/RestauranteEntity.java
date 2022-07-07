package com.trybe.restaurante.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe RestauranteEntity.
 **/
@Entity
public class RestauranteEntity {

  /**
   * Atributos.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column
  private String nome;

  @Column
  private String descricao;

  /**
   * COntructors.
   */
  public RestauranteEntity() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @param id
   * @param nome
   * @param descricao
   */
  public RestauranteEntity(Integer id, String nome, String descricao) {
    super();
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
  }

  /**
   * Métodos.
   */

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Integer getId() {
    return id;
  }
}
