package com.trybe.restaurante.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
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
  private Long id;

  /** The nome. */
  @Column
  private String nome;

  /** The descricao. */
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
   * Instantiates a new restaurante entity.
   *
   * @param id        the id
   * @param nome      the nome
   * @param descricao the descricao
   */
  public RestauranteEntity(Long id, String nome, String descricao) {
    super();
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
  }

  /**
   * Métodos.
   *
   * @return the nome
   */

  public String getNome() {
    return nome;
  }

  /**
   * Sets the nome.
   *
   * @param nome the new nome
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Gets the descricao.
   *
   * @return the descricao
   */
  public String getDescricao() {
    return descricao;
  }

  /**
   * Sets the descricao.
   *
   * @param descricao the new descricao
   */
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public Long getId() {
    return id;
  }
}
