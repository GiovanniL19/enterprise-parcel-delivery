package uk.co.giovannilenguito.dto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class ParcelDTOIT {
    
    public ParcelDTOIT() {
    }

    @Test
    public void testGetParcelId() {
        ParcelDTO instance = new ParcelDTO();
        instance.setParcelId(7);
        Integer expResult = 7;
        Integer result = instance.getParcelId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetParcelId() {
        ParcelDTO instance = new ParcelDTO();
        instance.setParcelId(7);
        Integer expResult = 7;
        Integer result = instance.getParcelId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetServiceType() {
        ParcelDTO instance = new ParcelDTO();
        instance.setServiceType("Service Type");
        String expResult = "Service Type";
        String result = instance.getServiceType();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetServiceType() {
        ParcelDTO instance = new ParcelDTO();
        instance.setServiceType("Service Type");
        String expResult = "Service Type";
        String result = instance.getServiceType();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetContents() {
        ParcelDTO instance = new ParcelDTO();
        instance.setContents("Contents");
        String expResult = "Contents";
        String result = instance.getContents();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetContents() {
        ParcelDTO instance = new ParcelDTO();
        instance.setContents("Contents");
        String expResult = "Contents";
        String result = instance.getContents();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDateBooked() {
        ParcelDTO instance = new ParcelDTO();
        instance.setDateBooked("Tuesday 25th April 2017");
        String expResult = "Tuesday 25th April 2017";
        String result = instance.getDateBooked();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDateBooked() {
        ParcelDTO instance = new ParcelDTO();
        instance.setDateBooked("Tuesday 25th April 2017");
        String expResult = "Tuesday 25th April 2017";
        String result = instance.getDateBooked();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDeliveryDate() {
        ParcelDTO instance = new ParcelDTO();
        instance.setDeliveryDate("Wednesday 26th April 2017");
        String expResult = "Wednesday 26th April 2017";
        String result = instance.getDeliveryDate();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDeliveryDate() {
        ParcelDTO instance = new ParcelDTO();
        instance.setDeliveryDate("Wednesday 26th April 2017");
        String expResult = "Wednesday 26th April 2017";
        String result = instance.getDeliveryDate();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCollectionLineOne() {
        ParcelDTO instance = new ParcelDTO();
        instance.setCollectionLineOne("Line One Collection Road");
        String expResult = "Line One Collection Road";
        String result = instance.getCollectionLineOne();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCollectionLineOne() {
        ParcelDTO instance = new ParcelDTO();
        instance.setCollectionLineOne("Line One Collection Road");
        String expResult = "Line One Collection Road";
        String result = instance.getCollectionLineOne();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCollectionPostcode() {
        ParcelDTO instance = new ParcelDTO();
        instance.setCollectionPostcode("Line One Post Code");
        String expResult = "Line One Post Code";
        String result = instance.getCollectionPostcode();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCollectionPostcode() {
        ParcelDTO instance = new ParcelDTO();
        instance.setCollectionPostcode("Line One Post Code");
        String expResult = "Line One Post Code";
        String result = instance.getCollectionPostcode();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAddressId() {
        ParcelDTO instance = new ParcelDTO();
        instance.setAddressId(7);
        int expResult = 7;
        int result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddressId() {
        ParcelDTO instance = new ParcelDTO();
        instance.setAddressId(7);
        int expResult = 7;
        int result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCustomerId() {
        ParcelDTO instance = new ParcelDTO();
        instance.setCustomerId(4);
        int expResult = 4;
        int result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCustomerId() {
        ParcelDTO instance = new ParcelDTO();
        instance.setCustomerId(4);
        int expResult = 4;
        int result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDriverId() {
        ParcelDTO instance = new ParcelDTO();
        instance.setDriverId(1);
        int expResult = 1;
        int result = instance.getDriverId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDriverId() {
        ParcelDTO instance = new ParcelDTO();
        instance.setDriverId(1);
        int expResult = 1;
        int result = instance.getDriverId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLocationId() {
        ParcelDTO instance = new ParcelDTO();
        instance.setLocationId(2);
        int expResult = 2;
        int result = instance.getLocationId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLocationId() {
        ParcelDTO instance = new ParcelDTO();
        instance.setLocationId(2);
        int expResult = 2;
        int result = instance.getLocationId();
        assertEquals(expResult, result);
    }
    
}
