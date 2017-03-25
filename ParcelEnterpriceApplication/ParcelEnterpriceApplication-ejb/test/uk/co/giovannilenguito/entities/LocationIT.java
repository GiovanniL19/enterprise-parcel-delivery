package uk.co.giovannilenguito.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class LocationIT {
    
    public LocationIT() {
    }

    @Test
    public void testGetLocationId() {
        System.out.println("getLocationId");
        Location instance = new Location();
        Integer expResult = null;
        Integer result = instance.getLocationId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLocationId() {
        System.out.println("setLocationId");
        Integer locationId = null;
        Location instance = new Location();
        instance.setLocationId(locationId);
    }

    @Test
    public void testGetLongitude() {
        System.out.println("getLongitude");
        Location instance = new Location();
        double expResult = 0.0;
        double result = instance.getLongitude();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetLongitude() {
        System.out.println("setLongitude");
        double longitude = 0.0;
        Location instance = new Location();
        instance.setLongitude(longitude);
    }

    @Test
    public void testGetLatitude() {
        System.out.println("getLatitude");
        Location instance = new Location();
        double expResult = 0.0;
        double result = instance.getLatitude();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetLatitude() {
        System.out.println("setLatitude");
        double latitude = 0.0;
        Location instance = new Location();
        instance.setLatitude(latitude);

    }

    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Location instance = new Location();
        String expResult = null;
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = null;
        Location instance = new Location();
        instance.setStatus(status);
    }

    @Test
    public void testGetIsDelivered() {
        System.out.println("getIsDelivered");
        Location instance = new Location();
        Boolean expResult = null;
        Boolean result = instance.getIsDelivered();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsDelivered() {
        System.out.println("setIsDelivered");
        Boolean isDelivered = null;
        Location instance = new Location();
        instance.setIsDelivered(isDelivered);
    }

    @Test
    public void testGetIsOutForDelivery() {
        System.out.println("getIsOutForDelivery");
        Location instance = new Location();
        Boolean expResult = null;
        Boolean result = instance.getIsOutForDelivery();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsOutForDelivery() {
        System.out.println("setIsOutForDelivery");
        Boolean isOutForDelivery = null;
        Location instance = new Location();
        instance.setIsOutForDelivery(isOutForDelivery);
    }

    @Test
    public void testGetIsCollecting() {
        System.out.println("getIsCollecting");
        Location instance = new Location();
        Boolean expResult = null;
        Boolean result = instance.getIsCollecting();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsCollecting() {
        System.out.println("setIsCollecting");
        Boolean isCollecting = null;
        Location instance = new Location();
        instance.setIsCollecting(isCollecting);
    }

    @Test
    public void testGetIsProcessing() {
        System.out.println("getIsProcessing");
        Location instance = new Location();
        Boolean expResult = null;
        Boolean result = instance.getIsProcessing();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsProcessing() {
        System.out.println("setIsProcessing");
        Boolean isProcessing = null;
        Location instance = new Location();
        instance.setIsProcessing(isProcessing);
    }

    @Test
    public void testGetDateTime() {
        System.out.println("getDateTime");
        Location instance = new Location();
        String expResult = null;
        String result = instance.getDateTime();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDateTime() {
        System.out.println("setDateTime");
        String dateTime = null;
        Location instance = new Location();
        instance.setDateTime(dateTime);
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Location instance = new Location();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Location instance = new Location();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Location instance = new Location();
        String expResult = "uk.co.giovannilenguito.entities.Location[ locationId=" + null + " ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
