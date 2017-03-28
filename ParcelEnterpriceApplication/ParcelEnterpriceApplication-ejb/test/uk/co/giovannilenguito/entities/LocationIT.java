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
        Location instance = new Location();
        instance.setLocationId(4);
        
        Integer expResult = 4;
        Integer result = instance.getLocationId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLocationId() {
        Location instance = new Location();
        instance.setLocationId(4);
        
        Integer expResult = 4;
        Integer result = instance.getLocationId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLongitude() {
        Location instance = new Location();
        instance.setLongitude(32323);
        
        double expResult = 32323;
        double result = instance.getLongitude();
        assertEquals(expResult, result, 32323);
    }

    @Test
    public void testSetLongitude() {
        Location instance = new Location();
        instance.setLongitude(32323);
        
        double expResult = 32323;
        double result = instance.getLongitude();
        assertEquals(expResult, result, 32323);
    }

    @Test
    public void testGetLatitude() {
        Location instance = new Location();
        instance.setLatitude(32322323);
        
        double expResult = 32323;
        double result = instance.getLatitude();
        assertEquals(expResult, result, 32322323);
    }

    @Test
    public void testSetLatitude() {
        Location instance = new Location();
        instance.setLatitude(32322323);
        
        double expResult = 32323;
        double result = instance.getLatitude();
        assertEquals(expResult, result, 32322323);

    }

    @Test
    public void testGetStatus() {
        Location instance = new Location();
        instance.setStatus("OK");
        String expResult = "OK";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetStatus() {
        Location instance = new Location();
        instance.setStatus("OK");
        String expResult = "OK";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIsDelivered() {
        Location instance = new Location();
        instance.setIsDelivered(false);
        Boolean expResult = false;
        Boolean result = instance.getIsDelivered();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsDelivered() {
        Location instance = new Location();
        instance.setIsDelivered(false);
        Boolean expResult = false;
        Boolean result = instance.getIsDelivered();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIsOutForDelivery() {
        Location instance = new Location();
        instance.setIsOutForDelivery(false);
        Boolean expResult = false;
        Boolean result = instance.getIsOutForDelivery();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsOutForDelivery() {
        Location instance = new Location();
        instance.setIsOutForDelivery(false);
        Boolean expResult = false;
        Boolean result = instance.getIsOutForDelivery();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIsCollecting() {
        Location instance = new Location();
        instance.setIsCollecting(false);
        Boolean expResult = false;
        Boolean result = instance.getIsCollecting();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsCollecting() {
        Location instance = new Location();
        instance.setIsCollecting(false);
        Boolean expResult = false;
        Boolean result = instance.getIsCollecting();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIsProcessing() {
        Location instance = new Location();
        instance.setIsProcessing(true);
        Boolean expResult = true;
        Boolean result = instance.getIsProcessing();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsProcessing() {
        Location instance = new Location();
        instance.setIsProcessing(true);
        Boolean expResult = true;
        Boolean result = instance.getIsProcessing();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDateTime() {
        Location instance = new Location();
        instance.setDateTime("Tuesday 25th April 2017");
        String expResult = "Tuesday 25th April 2017";
        String result = instance.getDateTime();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDateTime() {
        Location instance = new Location();
        instance.setDateTime("Tuesday 25th April 2017");
        String expResult = "Tuesday 25th April 2017";
        String result = instance.getDateTime();
        assertEquals(expResult, result);
    }

    @Test
    public void testHashCode() {
        Location instance = new Location();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals() {
        Object object = null;
        Location instance = new Location();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        Location instance = new Location();
        String expResult = "uk.co.giovannilenguito.entities.Location[ locationId=" + null + " ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
