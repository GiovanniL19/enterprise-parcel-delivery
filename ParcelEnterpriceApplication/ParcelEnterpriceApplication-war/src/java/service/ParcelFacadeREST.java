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
import uk.co.giovannilenguito.beans.DriverFacadeLocal;
import uk.co.giovannilenguito.beans.LocationFacadeLocal;
import uk.co.giovannilenguito.beans.ParcelFacadeLocal;
import uk.co.giovannilenguito.dto.ParcelDTO;
import uk.co.giovannilenguito.entities.Address;
import uk.co.giovannilenguito.entities.Customer;
import uk.co.giovannilenguito.entities.Driver;
import uk.co.giovannilenguito.entities.Location;
import uk.co.giovannilenguito.entities.Parcel;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Stateless
@Path("parcel")
public class ParcelFacadeREST {
    
    @EJB
    private ParcelFacadeLocal parcelFacadeLocal;
    @EJB
    private CustomerFacadeLocal customerFacadeLocal;
    @EJB
    private DriverFacadeLocal driverFacadeLocal;
    @EJB
    private AddressFacadeLocal addressFacadeLocal;
    @EJB
    private LocationFacadeLocal locationFacadeLocal;
    
    @POST
    @Path("new")
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(ParcelDTO dtoObj) {
        Address address = addressFacadeLocal.find(dtoObj.getAddressId());
        Customer customer = customerFacadeLocal.find(dtoObj.getCustomerId());
        Driver driver = driverFacadeLocal.find(dtoObj.getDriverId());
        Location location = locationFacadeLocal.find(dtoObj.getLocationId());
        
        ParserFactory parser = ParserFactory.getInstance();
        Parcel entity = parser.ParcelToEntity(dtoObj, address, customer, driver, location);
        parcelFacadeLocal.create(entity);
    }

    @PUT
    @Path("update/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, ParcelDTO dtoObj) {
        Address address = addressFacadeLocal.find(dtoObj.getAddressId());
        Customer customer = customerFacadeLocal.find(dtoObj.getCustomerId());
        Driver driver = driverFacadeLocal.find(dtoObj.getDriverId());
        Location location = locationFacadeLocal.find(dtoObj.getLocationId());
        
        ParserFactory parser = ParserFactory.getInstance();
        Parcel entity = parser.ParcelToEntity(dtoObj, address, customer, driver, location);
        parcelFacadeLocal.edit(entity);
    }

    @DELETE
    @Path("delete/{id}")
    public void remove(@PathParam("id") Integer id) {
        parcelFacadeLocal.remove(parcelFacadeLocal.find(id));
    }

    @GET
    @Path("findByCustomer/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Parcel> findByCustomer(@PathParam("id") int id) {
        Customer foundCustomer = (Customer) customerFacadeLocal.find(id);
        return parcelFacadeLocal.findByCustomer(foundCustomer);
    }
    
    @GET
    @Path("findByDriver/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Parcel> findByDriver(@PathParam("id") int id) {
        Driver foundDriver = (Driver) driverFacadeLocal.find(id);
        return parcelFacadeLocal.findByDriver(foundDriver);
    }
    
    @GET
    @Path("find/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Parcel find(@PathParam("id") int id) {
        return parcelFacadeLocal.find(id);
    }

    @GET
    @Path("find/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Parcel> findAll() {
        return parcelFacadeLocal.findAll();
    }
    
}
