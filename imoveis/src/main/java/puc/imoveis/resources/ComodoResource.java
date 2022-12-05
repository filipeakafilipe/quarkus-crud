package puc.imoveis.resources;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import puc.imoveis.entities.Comodo;
import puc.imoveis.services.ComodoService;

@Path("/comodo")
@Produces("application/json")
public class ComodoResource {
    @Inject
    ComodoService comodoService;

    @POST
    public Response create(Comodo comodoRequest) {
        comodoService.insert(comodoRequest);
        return Response.ok().build();
    }

    @GET
    @Path("/{id}")
    public Response get(Long id) {
        var comodo = comodoService.get(id);
        return Response.ok(comodo).build();
    }
    
    @DELETE
    @Path("/{id}")
    public Response delete(Long id) {
        comodoService.delete(id);
        return Response.ok().build();
    }

    @PATCH
    @Path("/{id}")
    public Response update(Long id, Comodo comodoRequest) {
        comodoService.update(id, comodoRequest);
        return Response.ok().build();
    }
}
