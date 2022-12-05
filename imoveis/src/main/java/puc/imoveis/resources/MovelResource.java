package puc.imoveis.resources;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.POST;

import puc.imoveis.entities.Movel;
import puc.imoveis.services.MovelService;

@Path("/movel")
@Produces("application/json")
public class MovelResource {
    @Inject
    MovelService movelService;

    @POST
    public Response create(Movel movel) {
        movelService.insert(movel);
        return Response.ok().build();
    }
}
