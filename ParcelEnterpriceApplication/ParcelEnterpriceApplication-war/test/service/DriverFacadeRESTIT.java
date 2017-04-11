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
public class DriverFacadeRESTIT {
    
    ConnectionHandler connectionHandler;
    
    public DriverFacadeRESTIT() {
        connectionHandler = new ConnectionHandler();
    }

    @Test
    public void testFind() throws Exception {
        //May need to change id to match database
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/driver/find/1"));
        assertNotNull(response);
    }

    @Test
    public void testFindByUsername() throws Exception {
        //May need to change username to match database
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/driver/findByUsername/Giovanni"));
        assertNotNull(response);
    }

    @Test
    public void testFindAll() throws Exception {
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/driver/find/all"));
        assertNotNull(response);
    }

    @Test
    public void testRandom() throws Exception {
       String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/driver/random"));
        assertNotNull(response);
    }
    
}
