package com.trybe.restaurante.service;

import com.trybe.restaurante.dto.RestauranteDto;
import com.trybe.restaurante.entity.RestauranteEntity;
import com.trybe.restaurante.repository.RestauranteRepository;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

// TODO: Auto-generated Javadoc
/**
 * Classe RestauranteService.
 **/

@ApplicationScoped
public class RestauranteService {

  /** The repo. */
  @Inject
  private RestauranteRepository repo;

  /**
   * Atributos.
   *
   * @param data the data
   */

  /**
   * Métodos.
   */
  @Transactional
  public void salvar(RestauranteDto data) {
    RestauranteEntity restaurante = new RestauranteEntity();
    restaurante.setNome(data.getNome());
    restaurante.setDescricao(data.getDescricao());
    repo.persist(restaurante);
  }

  /**
   * Listar.
   *
   * @return the list
   */
  public List<RestauranteEntity> listar() {
    return repo.listAll();
  }

  /**
   * Buscar por id.
   *
   * @param id the id
   * @return the restaurante entity
   */
  public RestauranteEntity buscarPorId(Long id) {
    return repo.findById(id);
  }

  /**
   * Atualizar.
   *
   * @param id the id
   * @param data the data
   */
  @Transactional
  public void atualizar(Long id, RestauranteDto data) {
    RestauranteEntity restaurante = repo.findById(id);
    restaurante.setNome(data.getNome());
    restaurante.setDescricao(data.getDescricao());
    repo.persist(restaurante);
  }

  /**
   * Deletar.
   *
   * @param id the id
   */
  @Transactional
  public void deletar(Long id) {
    repo.deleteById(id);
  }

}
