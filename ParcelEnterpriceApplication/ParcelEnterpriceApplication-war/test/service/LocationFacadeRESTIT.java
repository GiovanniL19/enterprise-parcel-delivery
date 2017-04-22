package service;

import handler.ConnectionHandler;
import java.net.URL;
import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 * 
 * EJB and War should be deployed before tests can run
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LocationFacadeRESTIT extends TestCase{
    private static ConnectionHandler connectionHandler;
    private static String id;
    
    public LocationFacadeRESTIT() {
    }
    
    @Override
    @BeforeClass
    protected void setUp() throws Exception {
        connectionHandler = new ConnectionHandler();
    }

    @Test
    public void testCreate() throws Exception {
        String data = "{\"dateTime\":\"Sat Apr 22 14:49:31 GMT+00:00 2017\",\"status\":\"Processing\",\"longitude\":0,\"latitude\":0,\"isDelivered\":false,\"isOutForDelivery\":false,\"isProcessing\":true,\"isCollecting\":false,\"locationId\":0}";
        String response = connectionHandler.post(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/location/new"), data);
        id = response;
        assertNotEquals(response, "0");
    }

    @Test
    public void testEdit() throws Exception {
        String data = "{\"dateTime\":\"Sat Apr 22 14:49:31 GMT+00:00 2017\",\"status\":\"Updated\",\"longitude\":0,\"latitude\":0,\"isDelivered\":false,\"isOutForDelivery\":false,\"isProcessing\":true,\"isCollecting\":false,\"locationId\":"+id+"}";
        boolean response = connectionHandler.put(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/location/update/" + id), data);
        assertEquals(response, true);
    }
    
    @Test
    public void testFind() throws Exception {
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/location/find/" + id));
        assertNotNull(response);
    }
    
    @Test
    public void testFindAll() throws Exception {
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/location/find/all"));
        assertNotNull(response);
        
    }
    
    @Test
    public void testRemove() throws Exception {
        boolean response = connectionHandler.delete(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/location/delete/" + id));
        assertEquals(response, true);
    }
    
}
