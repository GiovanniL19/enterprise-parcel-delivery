package service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import uk.co.giovannilenguito.beans.LogFacadeLocal;
import uk.co.giovannilenguito.entities.Log;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Stateless
@Path("log")
public class LogFacadeREST {

    @EJB
    LogFacadeLocal logFacadeLocal;
    
    @POST
    @Path("new")
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Log entity) {
        logFacadeLocal.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, Log entity) {
        logFacadeLocal.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        logFacadeLocal.remove(logFacadeLocal.find(id));
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Log find(@PathParam("id") Integer id) {
        return logFacadeLocal.find(id);
    }

    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Log> findAll() {
        return logFacadeLocal.findAll();
    }
    
}
