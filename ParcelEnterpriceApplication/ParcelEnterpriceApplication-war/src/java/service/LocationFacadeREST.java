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
import uk.co.giovannilenguito.beans.LocationFacadeLocal;
import uk.co.giovannilenguito.entities.Location;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Stateless
@Path("location")
public class LocationFacadeREST {

    @EJB
    LocationFacadeLocal locationFacadeLocal;
    
    @POST
    @Path("new")
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Location entity) {
        locationFacadeLocal.create(entity);
    }

    @PUT
    @Path("update/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, Location entity) {
        locationFacadeLocal.edit(entity);
    }

    @DELETE
    @Path("delete/{id}")
    public void remove(@PathParam("id") Integer id) {
        locationFacadeLocal.remove(locationFacadeLocal.find(id));
    }

    @GET
    @Path("find/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Location find(@PathParam("id") Integer id) {
        return locationFacadeLocal.find(id);
    }

    @GET
    @Path("find/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Location> findAll() {
        return locationFacadeLocal.findAll();
    }
    
}
