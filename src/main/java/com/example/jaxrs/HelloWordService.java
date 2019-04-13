package com.example.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;


@Path("/jaxrs")
public class HelloWordService {

	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario getMsg() {
 
		 Usuario usuario = new Usuario();
		
		 usuario.setNombre("Luis");
		 usuario.setApellido("Merchan");
		return usuario;
 
	}
	
}
