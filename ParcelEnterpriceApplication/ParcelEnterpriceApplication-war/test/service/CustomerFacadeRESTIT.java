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
public class CustomerFacadeRESTIT extends TestCase{
    
    private static ConnectionHandler connectionHandler;
    private static String addressId;
    private static String id;
    
    public CustomerFacadeRESTIT() {
    }
    
    @Override
    @BeforeClass
    protected void setUp() throws Exception {
        connectionHandler = new ConnectionHandler();
    }
    
    @Test
    public void testCreate() throws Exception {
        String data = "{\"lineOne\":\"fdf\",\"lineTwo\":\"fdf\",\"city\":\"dfd\",\"postcode\":\"fdf\",\"country\":\"dd\",\"addressId\":0}";
        addressId = connectionHandler.post(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/address/new"), data);
                
        String customerData = "{\"customerId\":0,\"username\":\"name\",\"password\":\"password\",\"email\":\"email@email.com\",\"fullName\":\"9\",\"contactNumber\":0716546444,\"addressId\":"+addressId+"}";
        String response = connectionHandler.post(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/customer/new"), customerData);
        id = response;
        assertNotEquals(response, "0");
    }

    @Test
    public void testEdit() throws Exception {
        String customerData = "{\"customerId\":"+id+",\"username\":\"nameUpdated\",\"password\":\"password\",\"email\":\"email@email.com\",\"fullName\":\"9\",\"contactNumber\":0716546444,\"addressId\":"+addressId+"}";
        boolean response = connectionHandler.put(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/customer/update/" + id), customerData);
        assertEquals(response, true);
    }
    
    @Test
    public void testFind() throws Exception {
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/customer/find/" + id));
        assertNotNull(response);
    }
    
    @Test
    public void testFindByUsername() throws Exception {
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/customer/findByUsername/nameUpdated"));
        assertNotNull(response);
    }
    
    @Test
    public void testFindAll() throws Exception {
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/customer/find/all"));
        assertNotNull(response);
        
    }
    
    @Test
    public void testRemove() throws Exception {
        boolean customerResponse = connectionHandler.delete(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/customer/delete/" + id));
        assertEquals(customerResponse, true);
    }
}
