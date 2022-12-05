package puc.imoveis.resources;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;

import puc.imoveis.entities.Movel;
import puc.imoveis.services.MovelService;

@Path("/movel")
@Produces("application/json")
public class MovelResource {
    @Inject
    MovelService movelService;

    @POST
    public Response create(Movel movelRequest) {
        movelService.insert(movelRequest);
        return Response.ok().build();
    }

    @GET
    @Path("/{id}")
    public Response get(Long id) {
        var movel = movelService.get(id);
        return Response.ok(movel).build();
    }
    
    @DELETE
    @Path("/{id}")
    public Response delete(Long id) {
        movelService.delete(id);
        return Response.ok().build();
    }

    @PATCH
    @Path("/{id}")
    public Response update(Long id, Movel movelRequest) {
        movelService.update(id, movelRequest);
        return Response.ok().build();
    }
}
