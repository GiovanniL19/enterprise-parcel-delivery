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
import uk.co.giovannilenguito.beans.CustomerFacadeLocal;
import uk.co.giovannilenguito.dto.CustomerDTO;
import uk.co.giovannilenguito.entities.Address;
import uk.co.giovannilenguito.entities.Customer;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Stateless
@Path("customer")
public class CustomerFacadeREST{

    @EJB
    private CustomerFacadeLocal customerFacadeLocal;
    
    @EJB
    private AddressFacadeLocal addressFacadeLocal;
    
    @POST
    @Path("new")
    @Consumes(MediaType.APPLICATION_JSON)
    public int create(CustomerDTO dtoObj) {
        Address address = addressFacadeLocal.find(dtoObj.getAddressId());
        ParserFactory parser = ParserFactory.getInstance();
        Customer entity = parser.customerToEntity(dtoObj, address);
        return customerFacadeLocal.createCustomer(entity);
    }

    @PUT
    @Path("update/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") int id, CustomerDTO dtoObj) {
        Address address = addressFacadeLocal.find(dtoObj.getAddressId());
        ParserFactory parser = ParserFactory.getInstance();
        Customer entity = parser.customerToEntity(dtoObj, address);
        customerFacadeLocal.edit(entity);
    }

    @DELETE
    @Path("delete/{id}")
    public void remove(@PathParam("id") int id) {
        customerFacadeLocal.remove(customerFacadeLocal.find(id));
    }

    @GET
    @Path("find/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer find(@PathParam("id") int id) {
        return customerFacadeLocal.find(id);
    }
    
    @GET
    @Path("findByUsername/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer findByUsername(@PathParam("username") String username) {
        return customerFacadeLocal.findByUsername(username);
    }
    
    @GET
    @Path("find/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> findAll() {
        return customerFacadeLocal.findAll();
    }
}
