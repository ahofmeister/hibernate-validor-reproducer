package org.acme;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.Validator;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/orders")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OrderResource {

  @Inject
  Validator validator;

  @POST
  @Transactional
  public Response post(@Valid OrderCreateView orderProcess) {
    validator.validate(orderProcess);

    return Response.ok(orderProcess).build();
  }
}