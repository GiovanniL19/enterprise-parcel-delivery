package uk.co.giovannilenguito.dto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class CustomerDTOIT {
    
    public CustomerDTOIT() {
    }

    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        CustomerDTO instance = new CustomerDTO();
        Integer expResult = null;
        Integer result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCustomerId() {
        System.out.println("setCustomerId");
        Integer customerId = null;
        CustomerDTO instance = new CustomerDTO();
        instance.setCustomerId(customerId);
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        CustomerDTO instance = new CustomerDTO();
        String expResult = null;
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = null;
        CustomerDTO instance = new CustomerDTO();
        instance.setEmail(email);
    }

    @Test
    public void testGetContactNumber() {
        System.out.println("getContactNumber");
        CustomerDTO instance = new CustomerDTO();
        String expResult = null;
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetContactNumber() {
        System.out.println("setContactNumber");
        String contactNumber = null;
        CustomerDTO instance = new CustomerDTO();
        instance.setContactNumber(contactNumber);
    }

    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        CustomerDTO instance = new CustomerDTO();
        String expResult = null;
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = null;
        CustomerDTO instance = new CustomerDTO();
        instance.setUsername(username);
    }

    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        CustomerDTO instance = new CustomerDTO();
        String expResult = null;
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = null;
        CustomerDTO instance = new CustomerDTO();
        instance.setPassword(password);
    }

    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        CustomerDTO instance = new CustomerDTO();
        String expResult = null;
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = null;
        CustomerDTO instance = new CustomerDTO();
        instance.setFullName(fullName);
    }

    @Test
    public void testGetAddressId() {
        System.out.println("getAddressId");
        CustomerDTO instance = new CustomerDTO();
        int expResult = 0;
        int result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddressId() {
        System.out.println("setAddressId");
        int addressId = 0;
        CustomerDTO instance = new CustomerDTO();
        instance.setAddressId(addressId);
    }
    
}
