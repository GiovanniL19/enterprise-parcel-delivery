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
public class CustomerIT {
    
    public CustomerIT() {
    }

    @Test
    public void testGetCustomerId() {
        Customer instance = new Customer();
        instance.setCustomerId(1);
        Integer expResult = 1;
        Integer result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCustomerId() {
        Customer instance = new Customer();
        instance.setCustomerId(1);
        Integer expResult = 1;
        Integer result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetEmail() {
        Customer instance = new Customer();
        instance.setEmail("email@example.com");
        String expResult = "email@example.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() {
        Customer instance = new Customer();
        instance.setEmail("email@example.com");
        String expResult = "email@example.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetContactNumber() {
        Customer instance = new Customer();
        instance.setContactNumber("0123456789");
        String expResult = "0123456789";
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetContactNumber() {
        Customer instance = new Customer();
        instance.setContactNumber("0123456789");
        String expResult = "0123456789";
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetUsername() {
        Customer instance = new Customer();
        instance.setUsername("UserName");
        String expResult = "UserName";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUsername() {
        Customer instance = new Customer();
        instance.setUsername("UserName");
        String expResult = "UserName";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPassword() {
        Customer instance = new Customer();
        instance.setPassword("123");
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPassword() {
        Customer instance = new Customer();
        instance.setPassword("123");
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFullName() {
        Customer instance = new Customer();
        instance.setFullName("Full Name");
        String expResult = "Full Name";
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFullName() {
        Customer instance = new Customer();
        instance.setFullName("Full Name");
        String expResult = "Full Name";
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetParcelCollection() {
        Customer instance = new Customer();
        List<Parcel> list = new ArrayList();
        list.add(new Parcel());
        
        instance.setParcelCollection(list);
        
        Collection<Parcel> expResult = list;
        Collection<Parcel> result = instance.getParcelCollection();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetParcelCollection() {
        Customer instance = new Customer();
        List<Parcel> list = new ArrayList();
        list.add(new Parcel());
        
        instance.setParcelCollection(list);
        
        Collection<Parcel> expResult = list;
        Collection<Parcel> result = instance.getParcelCollection();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAddressId() {
        Customer instance = new Customer();
        Address address = new Address();
        address.setAddressId(2);
        
        instance.setAddressId(address);
        Address expResult = address;
        Address result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddressId() {
        Customer instance = new Customer();
        Address address = new Address();
        address.setAddressId(2);
        
        instance.setAddressId(address);
        Address expResult = address;
        Address result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testHashCode() {
        Customer instance = new Customer();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals() {
        Object object = null;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        Customer instance = new Customer();
        String expResult = "uk.co.giovannilenguito.entities.Customer[ customerId=" + null + " ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
