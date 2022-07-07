package com.trybe.restaurante.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Classe RestauranteDto.
 **/

public class RestauranteDto {

  /**
   * Atributos.
   */
  @NotBlank
  private String nome;

  @NotBlank
  @Size(min = 3)
  private String descricao;

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

}
