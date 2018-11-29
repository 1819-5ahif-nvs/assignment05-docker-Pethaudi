package at.htl.nvs.microproject.rest;

import at.htl.nvs.microproject.dao.DAO;
import at.htl.nvs.microproject.entities.Section;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("section")
public class SectionEndpoint {

    @Inject
    DAO dao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        return Response.ok(dao.getAllSections()).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") long id) {
        return Response.ok(dao.getSectionById(id)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Section i) {
        dao.add(i);
        return Response.ok().build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(Section i) {
        dao.update(i);
        return Response.ok().build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(Section i) {
        dao.delete(i);
        return Response.ok().build();
    }

}
