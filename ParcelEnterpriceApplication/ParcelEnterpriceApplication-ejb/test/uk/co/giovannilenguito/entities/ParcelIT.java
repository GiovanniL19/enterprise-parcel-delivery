package uk.co.giovannilenguito.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class ParcelIT {
    
    public ParcelIT() {
    }

    @Test
    public void testGetParcelId() {
        Parcel instance = new Parcel();
        instance.setParcelId(7);
        Integer expResult = 7;
        Integer result = instance.getParcelId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetParcelId() {
        Parcel instance = new Parcel();
        instance.setParcelId(7);
        Integer expResult = 7;
        Integer result = instance.getParcelId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetServiceType() {
        Parcel instance = new Parcel();
        instance.setServiceType("Service Type");
        String expResult = "Service Type";
        String result = instance.getServiceType();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetServiceType() {
        Parcel instance = new Parcel();
        instance.setServiceType("Service Type");
        String expResult = "Service Type";
        String result = instance.getServiceType();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetContents() {
        Parcel instance = new Parcel();
        instance.setContents("Contents");
        String expResult = "Contents";
        String result = instance.getContents();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetContents() {
        Parcel instance = new Parcel();
        instance.setContents("Contents");
        String expResult = "Contents";
        String result = instance.getContents();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDateBooked() {
        Parcel instance = new Parcel();
        instance.setDateBooked("Tuesday 25th April 2017");
        String expResult = "Tuesday 25th April 2017";
        String result = instance.getDateBooked();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDateBooked() {
        Parcel instance = new Parcel();
        instance.setDateBooked("Tuesday 25th April 2017");
        String expResult = "Tuesday 25th April 2017";
        String result = instance.getDateBooked();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDeliveryDate() {
        Parcel instance = new Parcel();
        instance.setDeliveryDate("Wednesday 26th April 2017");
        String expResult = "Wednesday 26th April 2017";
        String result = instance.getDeliveryDate();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDeliveryDate() {
        Parcel instance = new Parcel();
        instance.setDeliveryDate("Wednesday 26th April 2017");
        String expResult = "Wednesday 26th April 2017";
        String result = instance.getDeliveryDate();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCollectionLineOne() {
        Parcel instance = new Parcel();
        instance.setCollectionLineOne("Line One Collection Road");
        String expResult = "Line One Collection Road";
        String result = instance.getCollectionLineOne();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCollectionLineOne() {
        Parcel instance = new Parcel();
        instance.setCollectionLineOne("Line One Collection Road");
        String expResult = "Line One Collection Road";
        String result = instance.getCollectionLineOne();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCollectionPostcode() {
        Parcel instance = new Parcel();
        instance.setCollectionPostcode("Line One Post Code");
        String expResult = "Line One Post Code";
        String result = instance.getCollectionPostcode();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCollectionPostcode() {
        Parcel instance = new Parcel();
        instance.setCollectionPostcode("Line One Post Code");
        String expResult = "Line One Post Code";
        String result = instance.getCollectionPostcode();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAddressId() {
        Parcel instance = new Parcel();
        Address address = new Address();
        address.setAddressId(2);
        instance.setAddressId(address);
        
        Address expResult = address;
        Address result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddressId() {
        Parcel instance = new Parcel();
        Address address = new Address();
        address.setAddressId(2);
        instance.setAddressId(address);
        
        Address expResult = address;
        Address result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCustomerId() {
        Parcel instance = new Parcel();
        Customer customer = new Customer();
        customer.setCustomerId(2);
        instance.setCustomerId(customer);
        
        Customer expResult = customer;
        Customer result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCustomerId() {
        Parcel instance = new Parcel();
        Customer customer = new Customer();
        customer.setCustomerId(2);
        instance.setCustomerId(customer);
        
        Customer expResult = customer;
        Customer result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDriverId() {
        Parcel instance = new Parcel();
        Driver driver = new Driver();
        driver.setDriverId(2);
        instance.setDriverId(driver);
        
        Driver expResult = driver;
        Driver result = instance.getDriverId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDriverId() {
        Parcel instance = new Parcel();
        Driver driver = new Driver();
        driver.setDriverId(2);
        instance.setDriverId(driver);
        
        Driver expResult = driver;
        Driver result = instance.getDriverId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLocationId() {
        Parcel instance = new Parcel();
        Location location = new Location();
        location.setLocationId(2);
        instance.setLocationId(location);
        
        Location expResult = location;
        Location result = instance.getLocationId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLocationId() {
        Parcel instance = new Parcel();
        Location location = new Location();
        location.setLocationId(2);
        instance.setLocationId(location);
        
        Location expResult = location;
        Location result = instance.getLocationId();
        assertEquals(expResult, result);
    }

    @Test
    public void testHashCode() {
        Parcel instance = new Parcel();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals() {
        Object object = null;
        Parcel instance = new Parcel();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        Parcel instance = new Parcel();
        String expResult = "uk.co.giovannilenguito.entities.Parcel[ parcelId=" + null + " ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
