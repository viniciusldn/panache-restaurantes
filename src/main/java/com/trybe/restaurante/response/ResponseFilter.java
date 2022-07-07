package com.trybe.restaurante.response;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

/**
 * Classe ResponseFilter.
 **/

@Provider
public class ResponseFilter implements ContainerResponseFilter {

  @Override
  public void filter(ContainerRequestContext requestContext,
      ContainerResponseContext responseContext) throws IOException {
    // teste para validar que o filtro foi executado
    responseContext.getHeaders().putSingle("X-Powered-By", "Trybe");

  }
}
