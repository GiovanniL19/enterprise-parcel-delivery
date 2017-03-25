package uk.co.giovannilenguito.entities;

import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class AddressIT {
    
    public AddressIT() {
    }

    @Test
    public void testGetAddressId() {
        System.out.println("getAddressId");
        Address instance = new Address();
        Integer expResult = null;
        Integer result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddressId() {
        System.out.println("setAddressId");
        Integer addressId = null;
        Address instance = new Address();
        instance.setAddressId(addressId);
    }

    @Test
    public void testGetLineOne() {
        System.out.println("getLineOne");
        Address instance = new Address();
        String expResult = null;
        String result = instance.getLineOne();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLineOne() {
        System.out.println("setLineOne");
        String lineOne = null;
        Address instance = new Address();
        instance.setLineOne(lineOne);
    }

    @Test
    public void testGetLineTwo() {
        System.out.println("getLineTwo");
        Address instance = new Address();
        String expResult = null;
        String result = instance.getLineTwo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLineTwo() {
        System.out.println("setLineTwo");
        String lineTwo = null;
        Address instance = new Address();
        instance.setLineTwo(lineTwo);
    }

    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Address instance = new Address();
        String expResult = null;
        String result = instance.getCity();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = null;
        Address instance = new Address();
        instance.setCity(city);
    }

    @Test
    public void testGetPostcode() {
        System.out.println("getPostcode");
        Address instance = new Address();
        String expResult = null;
        String result = instance.getPostcode();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPostcode() {
        System.out.println("setPostcode");
        String postcode = null;
        Address instance = new Address();
        instance.setPostcode(postcode);
    }

    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        Address instance = new Address();
        String expResult = null;
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = null;
        Address instance = new Address();
        instance.setCountry(country);
    }

    @Test
    public void testGetParcelCollection() {
        System.out.println("getParcelCollection");
        Address instance = new Address();
        Collection<Parcel> expResult = null;
        Collection<Parcel> result = instance.getParcelCollection();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetParcelCollection() {
        System.out.println("setParcelCollection");
        Collection<Parcel> parcelCollection = null;
        Address instance = new Address();
        instance.setParcelCollection(parcelCollection);
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Address instance = new Address();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Address instance = new Address();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Address instance = new Address();
        String expResult = "uk.co.giovannilenguito.entities.Address[ addressId=" + null + " ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
