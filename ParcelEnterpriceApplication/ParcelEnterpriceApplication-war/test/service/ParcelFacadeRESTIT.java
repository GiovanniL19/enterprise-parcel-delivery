package service;

import java.net.URL;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 * 
 * EJB and War should be deployed before tests can run
 */
public class ParcelFacadeRESTIT {
    
    ConnectionHandler connectionHandler;
    
    public ParcelFacadeRESTIT() {
        connectionHandler = new ConnectionHandler();
    }

    @Test
    public void testFindByCustomer() throws Exception {
        //May need to change customer name to match database
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/parcel/findByCustomer/1"));
        assertNotNull(response);
    }

    @Test
    public void testFindByDriver() throws Exception {
        //May need to change driver name to match database
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/parcel/findByDriver/1"));
        assertNotNull(response);
    }

    @Test
    public void testFind() throws Exception {
        //May need to change id name to match database
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/parcel/find/5"));
        assertNotNull(response);
    }

    @Test
    public void testFindAll() throws Exception {
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/parcel/find/all"));
        assertNotNull(response);
    }
    
}
