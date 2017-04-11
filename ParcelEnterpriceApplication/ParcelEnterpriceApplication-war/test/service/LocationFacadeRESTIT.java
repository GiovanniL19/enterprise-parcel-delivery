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
public class LocationFacadeRESTIT {
    
    ConnectionHandler connectionHandler;
    
    public LocationFacadeRESTIT() {
        connectionHandler = new ConnectionHandler();
    }

    @Test
    public void testFind() throws Exception {
        //May need to change id to match database
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/location/find/4"));
        assertNotNull(response);
    }

    @Test
    public void testFindAll() throws Exception {
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/location/find/all"));
        assertNotNull(response);
    }
    
}
