package service;

import factory.ParserFactory;
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
import uk.co.giovannilenguito.beans.AddressFacadeLocal;
import uk.co.giovannilenguito.dto.AddressDTO;
import uk.co.giovannilenguito.entities.Address;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Stateless
@Path("address")
public class AddressFacadeREST {

    @EJB
    private AddressFacadeLocal addressFacadeLocal;

    @POST
    @Path("new")
    @Consumes(MediaType.APPLICATION_JSON)
    public int create(AddressDTO dtoObj) {
        ParserFactory parser = ParserFactory.getInstance();
        Address entity = parser.addressToEntity(dtoObj);
        return addressFacadeLocal.createAddress(entity);
    }

    @PUT
    @Path("update/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") int id, AddressDTO dtoObj) {
        ParserFactory parser = ParserFactory.getInstance();
        Address entity = parser.addressToEntity(dtoObj);
        addressFacadeLocal.edit(entity);
    }

    @DELETE
    @Path("delete/{id}")
    public void remove(@PathParam("id") int id) {
        addressFacadeLocal.remove(addressFacadeLocal.find(id));
    }

    @GET
    @Path("find/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Address find(@PathParam("id") int id) {
        return addressFacadeLocal.find(id);
    }

    @GET
    @Path("find/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Address> findAll() {
        //Call session bean method
        return addressFacadeLocal.findAll();
    }
}
