package uk.co.giovannilenguito.entities;

import java.util.Collection;
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
        System.out.println("getCustomerId");
        Customer instance = new Customer();
        Integer expResult = null;
        Integer result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCustomerId() {
        System.out.println("setCustomerId");
        Integer customerId = null;
        Customer instance = new Customer();
        instance.setCustomerId(customerId);
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Customer instance = new Customer();
        String expResult = null;
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = null;
        Customer instance = new Customer();
        instance.setEmail(email);
    }

    @Test
    public void testGetContactNumber() {
        System.out.println("getContactNumber");
        Customer instance = new Customer();
        String expResult = null;
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetContactNumber() {
        System.out.println("setContactNumber");
        String contactNumber = null;
        Customer instance = new Customer();
        instance.setContactNumber(contactNumber);
    }

    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Customer instance = new Customer();
        String expResult = null;
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = null;
        Customer instance = new Customer();
        instance.setUsername(username);
    }

    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Customer instance = new Customer();
        String expResult = null;
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = null;
        Customer instance = new Customer();
        instance.setPassword(password);
    }

    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Customer instance = new Customer();
        String expResult = null;
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = null;
        Customer instance = new Customer();
        instance.setFullName(fullName);
    }

    @Test
    public void testGetParcelCollection() {
        System.out.println("getParcelCollection");
        Customer instance = new Customer();
        Collection<Parcel> expResult = null;
        Collection<Parcel> result = instance.getParcelCollection();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetParcelCollection() {
        System.out.println("setParcelCollection");
        Collection<Parcel> parcelCollection = null;
        Customer instance = new Customer();
        instance.setParcelCollection(parcelCollection);
    }

    @Test
    public void testGetAddressId() {
        System.out.println("getAddressId");
        Customer instance = new Customer();
        Address expResult = null;
        Address result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddressId() {
        System.out.println("setAddressId");
        Address addressId = null;
        Customer instance = new Customer();
        instance.setAddressId(addressId);
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Customer instance = new Customer();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Customer instance = new Customer();
        String expResult = "uk.co.giovannilenguito.entities.Customer[ customerId=" + null + " ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
