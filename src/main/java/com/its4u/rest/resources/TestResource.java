package com.its4u.rest.resources;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class TestResource {

	@PersistenceContext(unitName = "IAMPU")
	private EntityManager iamEntityManager;

	@GET
	public Response test() {
		return Response.ok(iamEntityManager.toString()).build();
	}

}
