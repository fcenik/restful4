package com.fatihcenik;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

// http://localhost:8080/Restful_Jersey/rest/hello/..
@Path(value = "/hello")
public class Merkez {
	
	// GET    == READ
	// POST   == INSERT
	// PUT    == UPDATE
	// DELETE == DELETE
	
	@GET
	@Path("{person}")
	public Response selamlama(@PathParam("person") String person) {
		return Response.status(200).entity("hello " + person).build();
	}

	@GET
	@Path(value ="/grüsse/{person}")
	public Response grüssen(@PathParam("person") String person) {
		return Response.status(200).entity("Guten Tag " + person).build();
	}
}
