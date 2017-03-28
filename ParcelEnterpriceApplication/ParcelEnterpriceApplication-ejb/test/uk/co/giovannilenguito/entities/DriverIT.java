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
public class DriverIT {
    
    public DriverIT() {
    }

    @Test
    public void testGetDriverId() {
        Driver instance = new Driver();
        instance.setDriverId(3);
        
        Integer expResult = 3;
        Integer result = instance.getDriverId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDriverId() {
        Driver instance = new Driver();
        instance.setDriverId(3);
        
        Integer expResult = 3;
        Integer result = instance.getDriverId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetEmail() {
        Driver instance = new Driver();
        instance.setEmail("driver@email.com");
        
        String expResult = "driver@email.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() {
        Driver instance = new Driver();
        instance.setEmail("driver@email.com");
        
        String expResult = "driver@email.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetContactNumber() {
        Driver instance = new Driver();
        instance.setContactNumber("0123456789");
        
        String expResult = "0123456789";
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetContactNumber() {
        Driver instance = new Driver();
        instance.setContactNumber("0123456789");
        
        String expResult = "0123456789";
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetUsername() {
        Driver instance = new Driver();
        instance.setUsername("UserName");
        
        String expResult = "UserName";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUsername() {
        Driver instance = new Driver();
        instance.setUsername("UserName");
        
        String expResult = "UserName";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPassword() {
        Driver instance = new Driver();
        instance.setPassword("123");
        
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPassword() {
        Driver instance = new Driver();
        instance.setPassword("123");
        
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFullName() {
        Driver instance = new Driver();
        instance.setFullName("Full Name");
        
        String expResult = "Full Name";
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFullName() {
        Driver instance = new Driver();
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
    public void testHashCode() {
        Driver instance = new Driver();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals() {
        Object object = null;
        Driver instance = new Driver();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        Driver instance = new Driver();
        String expResult = "uk.co.giovannilenguito.entities.Driver[ driverId=" + null + " ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
