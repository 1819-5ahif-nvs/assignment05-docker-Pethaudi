package at.htl.nvs.microproject.rest;

import at.htl.nvs.microproject.dao.DAO;
import at.htl.nvs.microproject.entities.Item;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("item")
public class ItemEndpoint {

    @Inject
    DAO dao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        return Response.ok(dao.getAllItems()).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") long id) {
        return Response.ok(dao.getItemById(id)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Item i) {
        dao.add(i);
        return Response.ok().build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(Item i) {
        dao.update(i);
        return Response.ok().build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(Item i) {
        dao.delete(i);
        return Response.ok().build();
    }
}
