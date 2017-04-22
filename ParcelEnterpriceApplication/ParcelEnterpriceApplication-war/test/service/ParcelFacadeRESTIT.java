package service;

import handler.ConnectionHandler;
import java.net.URL;
import junit.framework.TestCase;
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
public class ParcelFacadeRESTIT extends TestCase{
    private static ConnectionHandler connectionHandler;
    private static String id;
    
    
    public ParcelFacadeRESTIT() {
    }
    
    @Override
    @BeforeClass
    protected void setUp() throws Exception {
        connectionHandler = new ConnectionHandler();
    }
    
    @Test
    public void testCreate() throws Exception {
        String data = "{\"customerId\":1,\"addressId\":1,\"locationId\":117,\"driverId\":3,\"serviceType\":\"First Class Tracked\",\"contents\":\"test\",\"dateBooked\":\"Sat Apr 22 14:49:31 GMT+00:00 2017\",\"deliveryDate\":\"27\\/04\\/2017\",\"isDelivered\":false,\"isOutForDelivery\":false,\"isProcessing\":true,\"collectionLineOne\":\"FLAT B7C\",\"collectionPostcode\":\"ST1 4NE\"}";
        String response = connectionHandler.post(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/parcel/new"), data);
        id = response;
        assertNotEquals(response, "0");
    }
    
    @Test
    public void testEdit() throws Exception {
        String data = "{\"parcelId\":"+id+",\"customerId\":1,\"addressId\":1,\"locationId\":117,\"driverId\":3,\"serviceType\":\"First Class Tracked\",\"contents\":\"test\",\"dateBooked\":\"Sat Apr 22 14:49:31 GMT+00:00 2017\",\"deliveryDate\":\"27\\/04\\/2017\",\"isDelivered\":false,\"isOutForDelivery\":false,\"isProcessing\":true,\"collectionLineOne\":\"FLAT B7C\",\"collectionPostcode\":\"ST1 4NE\"}";
        boolean response = connectionHandler.put(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/parcel/update/" + id), data);
        assertEquals(response, true);
    }
    
    @Test
    public void testFind() throws Exception {
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/parcel/find/" + id));
        assertNotNull(response);
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
    public void testFindAll() throws Exception {
        String response = connectionHandler.get(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/parcel/find/all"));
        assertNotNull(response);
        
    }
    
    @Test
    public void testRemove() throws Exception {
        boolean response = connectionHandler.delete(new URL("http://localhost:8080/ParcelEnterpriceApplication-war/parcel/delete/" + id));
        assertEquals(response, true);
    }
}
