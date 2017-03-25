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
        System.out.println("getParcelId");
        ParcelDTO instance = new ParcelDTO();
        int expResult = 0;
        int result = instance.getParcelId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetParcelId() {
        System.out.println("setParcelId");
        int parcelId = 0;
        ParcelDTO instance = new ParcelDTO();
        instance.setParcelId(parcelId);
    }

    @Test
    public void testGetServiceType() {
        System.out.println("getServiceType");
        ParcelDTO instance = new ParcelDTO();
        String expResult = null;
        String result = instance.getServiceType();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetServiceType() {
        System.out.println("setServiceType");
        String serviceType = null;
        ParcelDTO instance = new ParcelDTO();
        instance.setServiceType(serviceType);
    }

    @Test
    public void testGetContents() {
        System.out.println("getContents");
        ParcelDTO instance = new ParcelDTO();
        String expResult = null;
        String result = instance.getContents();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetContents() {
        System.out.println("setContents");
        String contents = null;
        ParcelDTO instance = new ParcelDTO();
        instance.setContents(contents);
    }

    @Test
    public void testGetDateBooked() {
        System.out.println("getDateBooked");
        ParcelDTO instance = new ParcelDTO();
        String expResult = null;
        String result = instance.getDateBooked();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDateBooked() {
        System.out.println("setDateBooked");
        String dateBooked = null;
        ParcelDTO instance = new ParcelDTO();
        instance.setDateBooked(dateBooked);
    }

    @Test
    public void testGetDeliveryDate() {
        System.out.println("getDeliveryDate");
        ParcelDTO instance = new ParcelDTO();
        String expResult = null;
        String result = instance.getDeliveryDate();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDeliveryDate() {
        System.out.println("setDeliveryDate");
        String deliveryDate = null;
        ParcelDTO instance = new ParcelDTO();
        instance.setDeliveryDate(deliveryDate);
    }

    @Test
    public void testGetCollectionLineOne() {
        System.out.println("getCollectionLineOne");
        ParcelDTO instance = new ParcelDTO();
        String expResult = null;
        String result = instance.getCollectionLineOne();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCollectionLineOne() {
        System.out.println("setCollectionLineOne");
        String collectionLineOne = null;
        ParcelDTO instance = new ParcelDTO();
        instance.setCollectionLineOne(collectionLineOne);
    }

    @Test
    public void testGetCollectionPostcode() {
        System.out.println("getCollectionPostcode");
        ParcelDTO instance = new ParcelDTO();
        String expResult = null;
        String result = instance.getCollectionPostcode();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCollectionPostcode() {
        System.out.println("setCollectionPostcode");
        String collectionPostcode = null;
        ParcelDTO instance = new ParcelDTO();
        instance.setCollectionPostcode(collectionPostcode);
    }

    @Test
    public void testGetAddressId() {
        System.out.println("getAddressId");
        ParcelDTO instance = new ParcelDTO();
        int expResult = 0;
        int result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddressId() {
        System.out.println("setAddressId");
        int addressId = 0;
        ParcelDTO instance = new ParcelDTO();
        instance.setAddressId(addressId);
    }

    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        ParcelDTO instance = new ParcelDTO();
        int expResult = 0;
        int result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCustomerId() {
        System.out.println("setCustomerId");
        int customerId = 0;
        ParcelDTO instance = new ParcelDTO();
        instance.setCustomerId(customerId);
    }

    @Test
    public void testGetDriverId() {
        System.out.println("getDriverId");
        ParcelDTO instance = new ParcelDTO();
        int expResult = 0;
        int result = instance.getDriverId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDriverId() {
        System.out.println("setDriverId");
        int driverId = 0;
        ParcelDTO instance = new ParcelDTO();
        instance.setDriverId(driverId);
    }

    @Test
    public void testGetLocationId() {
        System.out.println("getLocationId");
        ParcelDTO instance = new ParcelDTO();
        int expResult = 0;
        int result = instance.getLocationId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLocationId() {
        System.out.println("setLocationId");
        int locationId = 0;
        ParcelDTO instance = new ParcelDTO();
        instance.setLocationId(locationId);
    }
    
}
