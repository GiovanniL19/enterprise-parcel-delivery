package service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import uk.co.giovannilenguito.entities.Parcel;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Stateless
@Path("parcel")
public class ParcelFacadeREST extends AbstractFacade<Parcel> {

    @PersistenceContext(unitName = "ParcelEnterpriceApplication-warPU")
    private EntityManager em;

    public ParcelFacadeREST() {
        super(Parcel.class);
    }

    @POST
    @Path("new")
    @Override
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Parcel entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, Parcel entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Parcel find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Path("all")
    @Override
    @Produces(MediaType.APPLICATION_JSON)
    public List<Parcel> findAll() {
        return super.findAll();
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
