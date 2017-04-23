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
import messaging.Receiver;
import messaging.Sender;
import uk.co.giovannilenguito.beans.CustomerFacadeLocal;
import uk.co.giovannilenguito.beans.DriverFacadeLocal;
import uk.co.giovannilenguito.beans.LogFacadeLocal;
import uk.co.giovannilenguito.dto.LogDTO;
import uk.co.giovannilenguito.entities.Customer;
import uk.co.giovannilenguito.entities.Driver;
import uk.co.giovannilenguito.entities.Log;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
@Stateless
@Path("logs")
public class LogFacadeREST {

    @EJB Sender sender;
    @EJB Receiver receiver;
    
    @EJB
    private LogFacadeLocal logFacadeLocal;
    @EJB
    private CustomerFacadeLocal customerFacadeLocal;
    @EJB
    private DriverFacadeLocal driverFacadeLocal;
    
    @GET
    @Path("message")
    @Consumes(MediaType.APPLICATION_JSON)
    public String messageSendAndReciece() {
        String message = "Hello World, this is JMS";
        sender.send(message);
        
        String messageReceived = receiver.receive();
        
        return messageReceived;
    }
    
    @POST
    @Path("new")
    @Consumes(MediaType.APPLICATION_JSON)
    public int create(LogDTO dtoObj) {
        Customer customer = customerFacadeLocal.find(dtoObj.getCustomerId());
        Driver driver = driverFacadeLocal.find(dtoObj.getDriverId());
        
        ParserFactory parser = ParserFactory.getInstance();
        Log entity = parser.logToEntity(dtoObj, customer, driver);
        return logFacadeLocal.createLog(entity);
    }

    @PUT
    @Path("update/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") int id, LogDTO dtoObj) {
        Customer customer = customerFacadeLocal.find(dtoObj.getCustomerId());
        Driver driver = driverFacadeLocal.find(dtoObj.getDriverId());
        
        ParserFactory parser = ParserFactory.getInstance();
        Log entity = parser.logToEntity(dtoObj, customer, driver);
        logFacadeLocal.edit(entity);
    }

    @DELETE
    @Path("delete/{id}")
    public void remove(@PathParam("id") int id) {
        logFacadeLocal.remove(logFacadeLocal.find(id));
    }

    @GET
    @Path("find/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Log find(@PathParam("id") int id) {
        return logFacadeLocal.find(id);
    }

    @GET
    @Path("find/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Log> findAll() {
        return logFacadeLocal.findAll();
    }
    
}
