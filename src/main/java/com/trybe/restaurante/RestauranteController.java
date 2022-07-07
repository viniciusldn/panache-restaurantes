package com.trybe.restaurante;

import com.trybe.restaurante.dto.RestauranteDto;
import com.trybe.restaurante.entity.RestauranteEntity;
import com.trybe.restaurante.service.RestauranteService;

import io.netty.handler.codec.http.HttpStatusClass;

import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;

// TODO: Auto-generated Javadoc
/**
 * Classe RestauranteController.
 **/

@Path("/restaurante")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RestauranteController {

  /** The service. */
  @Inject
  private RestauranteService service;

  /**
   * Métodos.
   *
   * @return the list
   */
  @GET
  public Response listar() {
    return Response.ok(service.listar()).build();
  }

  /**
   * Buscar por id.
   *
   * @param id the id
   * @return the restaurante entity
   */
  @GET
  @Path("/{id}")
  public Response buscarPorId(@PathParam(value = "id") Long id) {
    try {
      return Response.ok(service.buscarPorId(id)).build();
    } catch (Exception e) {
      throw new Error(e.getMessage());
    }

  }

  /**
   * Salvar.
   *
   * @param data the data
   */
  @POST
  public Response salvar(@Valid RestauranteDto data) {
    try {
      service.salvar(data);
      return Response.created(null).build();
    } catch (Exception e) {
      throw new Error(e.getMessage());
    }
  }

  /**
   * Atualizar.
   *
   * @param id   the id
   * @param data the data
   */
  @PATCH
  @Path("/{id}")
  public Response atualizar(@PathParam(value = "id") Long id,
      @Valid RestauranteDto data) {
    try {
      service.atualizar(id, data);
      return Response.ok().build();
    } catch (Exception e) {
      throw new Error(e.getMessage());
    }
  }

  /**
   * Deletar.
   *
   * @param id the id
   */
  @DELETE
  @Path("/{id}")
  public Response deletar(@PathParam(value = "id") Long id) {
    try {
      service.deletar(id);
      return Response.ok().build();
    } catch (Exception e) {
      throw new Error(e.getMessage());
    }
  }

}
