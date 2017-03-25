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
        System.out.println("getLocationId");
        LocationDTO instance = new LocationDTO();
        Integer expResult = null;
        Integer result = instance.getLocationId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLocationId() {
        System.out.println("setLocationId");
        Integer locationId = null;
        LocationDTO instance = new LocationDTO();
        instance.setLocationId(locationId);
    }

    @Test
    public void testGetLongitude() {
        System.out.println("getLongitude");
        LocationDTO instance = new LocationDTO();
        double expResult = 0.0;
        double result = instance.getLongitude();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetLongitude() {
        System.out.println("setLongitude");
        double longitude = 0.0;
        LocationDTO instance = new LocationDTO();
        instance.setLongitude(longitude);
    }

    @Test
    public void testGetLatitude() {
        System.out.println("getLatitude");
        LocationDTO instance = new LocationDTO();
        double expResult = 0.0;
        double result = instance.getLatitude();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetLatitude() {
        System.out.println("setLatitude");
        double latitude = 0.0;
        LocationDTO instance = new LocationDTO();
        instance.setLatitude(latitude);
    }

    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        LocationDTO instance = new LocationDTO();
        String expResult = null;
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = null;
        LocationDTO instance = new LocationDTO();
        instance.setStatus(status);
    }

    @Test
    public void testGetIsDelivered() {
        System.out.println("getIsDelivered");
        LocationDTO instance = new LocationDTO();
        Boolean expResult = null;
        Boolean result = instance.getIsDelivered();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsDelivered() {
        System.out.println("setIsDelivered");
        Boolean isDelivered = null;
        LocationDTO instance = new LocationDTO();
        instance.setIsDelivered(isDelivered);
    }

    @Test
    public void testGetIsOutForDelivery() {
        System.out.println("getIsOutForDelivery");
        LocationDTO instance = new LocationDTO();
        Boolean expResult = null;
        Boolean result = instance.getIsOutForDelivery();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsOutForDelivery() {
        System.out.println("setIsOutForDelivery");
        Boolean isOutForDelivery = null;
        LocationDTO instance = new LocationDTO();
        instance.setIsOutForDelivery(isOutForDelivery);
    }

    @Test
    public void testGetIsCollecting() {
        System.out.println("getIsCollecting");
        LocationDTO instance = new LocationDTO();
        Boolean expResult = null;
        Boolean result = instance.getIsCollecting();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsCollecting() {
        System.out.println("setIsCollecting");
        Boolean isCollecting = null;
        LocationDTO instance = new LocationDTO();
        instance.setIsCollecting(isCollecting);
    }

    @Test
    public void testGetIsProcessing() {
        System.out.println("getIsProcessing");
        LocationDTO instance = new LocationDTO();
        Boolean expResult = null;
        Boolean result = instance.getIsProcessing();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIsProcessing() {
        System.out.println("setIsProcessing");
        Boolean isProcessing = null;
        LocationDTO instance = new LocationDTO();
        instance.setIsProcessing(isProcessing);
    }

    @Test
    public void testGetDateTime() {
        System.out.println("getDateTime");
        LocationDTO instance = new LocationDTO();
        String expResult = null;
        String result = instance.getDateTime();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDateTime() {
        System.out.println("setDateTime");
        String dateTime = null;
        LocationDTO instance = new LocationDTO();
        instance.setDateTime(dateTime);
    }
    
}
