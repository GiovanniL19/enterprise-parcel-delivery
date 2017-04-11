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
public class LogFacadeRESTIT {
    ConnectionHandler connectionHandler;
    
    public LogFacadeRESTIT() {
        connectionHandler = new ConnectionHandler();
    }

    @Test
    public void testFind() throws Exception {
        //May need to change id to match database
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/logs/find/106"));
        assertNotNull(response);
    }

    @Test
    public void testFindAll() throws Exception {
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/logs/find/all"));
        assertNotNull(response);
    }
    
}
