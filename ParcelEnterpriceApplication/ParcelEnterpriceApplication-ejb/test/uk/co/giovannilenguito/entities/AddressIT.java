package uk.co.giovannilenguito.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
        Address instance = new Address();
        instance.setAddressId(1);
        Integer expResult = 1;
        Integer result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddressId() {
        Address instance = new Address();
        instance.setAddressId(1);
        Integer expResult = 1;
        Integer result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLineOne() {
        Address instance = new Address();
        instance.setLineOne("Line One");
        String expResult = "Line One";
        String result = instance.getLineOne();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLineOne() {
        Address instance = new Address();
        instance.setLineOne("Line One");
        String expResult = "Line One";
        String result = instance.getLineOne();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLineTwo() {
        Address instance = new Address();
        instance.setLineTwo("Line Two");
        String expResult = "Line Two";
        String result = instance.getLineTwo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLineTwo() {
        Address instance = new Address();
        instance.setLineTwo("Line Two");
        String expResult = "Line Two";
        String result = instance.getLineTwo();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCity() {
        Address instance = new Address();
        instance.setCity("City");
        String expResult = "City";
        String result = instance.getCity();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCity() {
        Address instance = new Address();
        instance.setCity("City");
        String expResult = "City";
        String result = instance.getCity();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPostcode() {
        Address instance = new Address();
        instance.setPostcode("Postcode");
        String expResult = "Postcode";
        String result = instance.getPostcode();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPostcode() {
        Address instance = new Address();
        instance.setPostcode("Postcode");
        String expResult = "Postcode";
        String result = instance.getPostcode();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCountry() {
        Address instance = new Address();
        instance.setCountry("Country");
        String expResult = "Country";
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCountry() {
        Address instance = new Address();
        instance.setCountry("Country");
        String expResult = "Country";
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetParcelCollection() {
        Address instance = new Address();
        List<Parcel> list = new ArrayList();
        list.add(new Parcel());
        
        instance.setParcelCollection(list);
        
        Collection<Parcel> expResult = list;
        Collection<Parcel> result = instance.getParcelCollection();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetParcelCollection() {
        Address instance = new Address();
        List<Parcel> list = new ArrayList();
        list.add(new Parcel());
        
        instance.setParcelCollection(list);
        
        Collection<Parcel> expResult = list;
        Collection<Parcel> result = instance.getParcelCollection();
        assertEquals(expResult, result);
    }

    @Test
    public void testHashCode() {
        Address instance = new Address();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals() {
        Object object = null;
        Address instance = new Address();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        Address instance = new Address();
        String expResult = "uk.co.giovannilenguito.entities.Address[ addressId=" + null + " ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
