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
import uk.co.giovannilenguito.beans.ParcelFacadeLocal;
import uk.co.giovannilenguito.entities.Parcel;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Stateless
@Path("parcel")
public class ParcelFacadeREST {
    
    @EJB
    ParcelFacadeLocal parcelFacadeLocal;

    @POST
    @Path("new")
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Parcel entity) {
        parcelFacadeLocal.create(entity);
    }

    @PUT
    @Path("update/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, Parcel entity) {
        parcelFacadeLocal.edit(entity);
    }

    @DELETE
    @Path("delete/{id}")
    public void remove(@PathParam("id") Integer id) {
        parcelFacadeLocal.remove(parcelFacadeLocal.find(id));
    }

    @GET
    @Path("find/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Parcel find(@PathParam("id") Integer id) {
        return parcelFacadeLocal.find(id);
    }

    @GET
    @Path("find/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Parcel> findAll() {
        return parcelFacadeLocal.findAll();
    }
    
}
