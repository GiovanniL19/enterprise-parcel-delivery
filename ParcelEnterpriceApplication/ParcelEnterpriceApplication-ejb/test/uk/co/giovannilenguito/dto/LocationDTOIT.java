package uk.co.giovannilenguito.dto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class LocationDTOIT {
    
    public LocationDTOIT() {
    }

    @Test
    public void testGetLocationId() {
        LocationDTO instance = new LocationDTO();
        instance.setLocationId(4);
        
        Integer expResult = 4;
        Integer result = instance.getLocationId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLocationId() {
        LocationDTO instance = new LocationDTO();
        instance.setLocationId(4);
        
        Integer expResult = 4;
        Integer result = instance.getLocationId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLongitude() {
        LocationDTO instance = new LocationDTO();
        instance.setLongitude(32323);
        
        double expResult = 32323;
        double result = instance.getLongitude();
        assertEquals(expResult, result, 32323);
    }

    @Test
    public void testSetLongitude() {
        LocationDTO instance = new LocationDTO();
        instance.setLongitude(32323);
        
        double expResult = 32323;
        double result = instance.getLongitude();
        assertEquals(expResult, result, 32323);
    }

    @Test
    public void testGetLatitude() {
        LocationDTO instance = new LocationDTO();
        instance.setLatitude(32322323);
        
        double expResult = 32323;
        double result = instance.getLatitude();
        assertEquals(expResult, result, 32322323);
    }

    @Test
    public void testSetLatitude() {
        LocationDTO instance = new LocationDTO();
        instance.setLatitude(32322323);
        
        double expResult = 32323;
        double result = instance.getLatitude();
        assertEquals(expResult, result, 32322323);

    }

    @Test
    public void testGetStatus() {
        LocationDTO instance = new LocationDTO();
        instance.setStatus("OK");
        String expResult = "OK";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetStatus() {
        LocationDTO instance = new LocationDTO();
        instance.setStatus("OK");
        String expResult = "OK";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIsDelivered() {
        LocationDTO instance = new LocationDTO();
        instance.setIsDelivered(false);
        Boolean expResult = false;
        Boolean result = instance.getIsDelivered();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsDelivered() {
        LocationDTO instance = new LocationDTO();
        instance.setIsDelivered(false);
        Boolean expResult = false;
        Boolean result = instance.getIsDelivered();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIsOutForDelivery() {
        LocationDTO instance = new LocationDTO();
        instance.setIsOutForDelivery(false);
        Boolean expResult = false;
        Boolean result = instance.getIsOutForDelivery();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsOutForDelivery() {
        LocationDTO instance = new LocationDTO();
        instance.setIsOutForDelivery(false);
        Boolean expResult = false;
        Boolean result = instance.getIsOutForDelivery();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIsCollecting() {
        LocationDTO instance = new LocationDTO();
        instance.setIsCollecting(false);
        Boolean expResult = false;
        Boolean result = instance.getIsCollecting();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsCollecting() {
        LocationDTO instance = new LocationDTO();
        instance.setIsCollecting(false);
        Boolean expResult = false;
        Boolean result = instance.getIsCollecting();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIsProcessing() {
        LocationDTO instance = new LocationDTO();
        instance.setIsProcessing(true);
        Boolean expResult = true;
        Boolean result = instance.getIsProcessing();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsProcessing() {
        LocationDTO instance = new LocationDTO();
        instance.setIsProcessing(true);
        Boolean expResult = true;
        Boolean result = instance.getIsProcessing();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDateTime() {
        LocationDTO instance = new LocationDTO();
        instance.setDateTime("Tuesday 25th April 2017");
        String expResult = "Tuesday 25th April 2017";
        String result = instance.getDateTime();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDateTime() {
        LocationDTO instance = new LocationDTO();
        instance.setDateTime("Tuesday 25th April 2017");
        String expResult = "Tuesday 25th April 2017";
        String result = instance.getDateTime();
        assertEquals(expResult, result);
    }
    
}
