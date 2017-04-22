package service;

import handler.ConnectionHandler;
import java.net.URL;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 * 
 * EJB and War should be deployed before tests can run
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DriverFacadeRESTIT extends TestCase{
    private static ConnectionHandler connectionHandler;
    private static String id;
    
    public DriverFacadeRESTIT() {
    }
    
    @Override
    @BeforeClass
    protected void setUp() throws Exception {
        connectionHandler = new ConnectionHandler();
    }
    
    @Test
    public void testCreate() throws Exception {
        String data = "{\"driverId\":0,\"username\":\"h\",\"password\":\"h\",\"email\":\"h\",\"fullName\":\"h\",\"contactNumber\":4}";
        String response = connectionHandler.post(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/driver/new"), data);
        id = response;
        assertNotEquals(response, "0");
    }

    @Test
    public void testEdit() throws Exception {
        String data = "{\"driverId\":"+id+",\"username\":\"helloWorld\",\"password\":\"h\",\"email\":\"h\",\"fullName\":\"h\",\"contactNumber\":4}";
        boolean response = connectionHandler.put(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/driver/update/" + id), data);
        assertEquals(response, true);
    }
    
    @Test
    public void testFind() throws Exception {
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/driver/find/" + id));
        assertNotNull(response);
    }
    
    @Test
    public void testFindByUsername() throws Exception {
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/driver/findByUsername/helloWorld"));
        assertNotNull(response);
    }
    
    @Test
    public void testFindAll() throws Exception {
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/driver/find/all"));
        assertNotNull(response);
        
    }
    
    @Test
    public void testRemove() throws Exception {
        boolean response = connectionHandler.delete(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/driver/delete/" + id));
        assertEquals(response, true);
    }
    
}
