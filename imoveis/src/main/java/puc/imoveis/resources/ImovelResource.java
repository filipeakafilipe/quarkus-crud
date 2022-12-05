package puc.imoveis.resources;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import puc.imoveis.entities.Imovel;
import puc.imoveis.services.ImovelService;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;

@Path("/imovel")
@Produces("application/json")
public class ImovelResource {
    @Inject
    ImovelService imovelService;
    
    @POST
    public Response create(Imovel imovelRequest) {
        imovelService.insert(imovelRequest);
        return Response.ok().build();
    }

    @GET
    @Path("/{id}")
    public Response get(Long id) {
        var imovel = imovelService.get(id);
        return Response.ok(imovel).build();
    }
    
    @DELETE
    @Path("/{id}")
    public Response delete(Long id) {
        imovelService.delete(id);
        return Response.ok().build();
    }

    @PATCH
    @Path("/{id}")
    public Response update(Long id, Imovel imovelRequest) {
        imovelService.update(id, imovelRequest);
        return Response.ok().build();
    }
}
