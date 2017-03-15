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
import uk.co.giovannilenguito.beans.DriverFacadeLocal;
import uk.co.giovannilenguito.entities.Driver;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Stateless
@Path("driver")
public class DriverFacadeREST{

    @EJB
    DriverFacadeLocal driverFacadeLocal;

    @POST
    @Path("new")
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Driver entity) {
        driverFacadeLocal.create(entity);
    }

    @PUT
    @Path("update/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, Driver entity) {
        driverFacadeLocal.edit(entity);
    }

    @DELETE
    @Path("delete/{id}")
    public void remove(@PathParam("id") Integer id) {
        driverFacadeLocal.remove(driverFacadeLocal.find(id));
    }

    @GET
    @Path("find/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Driver find(@PathParam("id") Integer id) {
        return driverFacadeLocal.find(id);
    }

    @GET
    @Path("findByUsername/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public Driver findByUsername(@PathParam("username") String username) {
        return driverFacadeLocal.findByUsername(username);
    }
    
    @GET
    @Path("find/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Driver> findAll() {
        return driverFacadeLocal.findAll();
    }
    
}
