package br.com.blogdofornias.rest.util;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import br.com.blogdofornias.dto.ErroDTO;
import br.com.blogdofornias.rest.RestException;

@Provider
public class ExceptionMapperImpl implements ExceptionMapper<Throwable> {

	public ExceptionMapperImpl() {
	}

	@Override
	public Response toResponse(Throwable erro) {
		ErroDTO erroDTO = null;

		if(erro instanceof RestException) {
			erroDTO = new ErroDTO(((RestException) erro).getCodigoErro(), erro.getMessage());
		} else {
			erroDTO = new ErroDTO(erro.getMessage());
		}
		
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(erroDTO).build();
	}

}
