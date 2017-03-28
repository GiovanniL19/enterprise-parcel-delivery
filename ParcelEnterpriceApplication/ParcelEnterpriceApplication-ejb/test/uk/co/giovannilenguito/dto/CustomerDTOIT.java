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
        CustomerDTO instance = new CustomerDTO();
        instance.setCustomerId(1);
        Integer expResult = 1;
        Integer result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCustomerId() {
        CustomerDTO instance = new CustomerDTO();
        instance.setCustomerId(1);
        Integer expResult = 1;
        Integer result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetEmail() {
        CustomerDTO instance = new CustomerDTO();
        instance.setEmail("email@example.com");
        String expResult = "email@example.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() {
        CustomerDTO instance = new CustomerDTO();
        instance.setEmail("email@example.com");
        String expResult = "email@example.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetContactNumber() {
        CustomerDTO instance = new CustomerDTO();
        instance.setContactNumber("0123456789");
        String expResult = "0123456789";
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetContactNumber() {
        CustomerDTO instance = new CustomerDTO();
        instance.setContactNumber("0123456789");
        String expResult = "0123456789";
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetUsername() {
        CustomerDTO instance = new CustomerDTO();
        instance.setUsername("UserName");
        String expResult = "UserName";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUsername() {
        CustomerDTO instance = new CustomerDTO();
        instance.setUsername("UserName");
        String expResult = "UserName";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPassword() {
        CustomerDTO instance = new CustomerDTO();
        instance.setPassword("123");
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPassword() {
        CustomerDTO instance = new CustomerDTO();
        instance.setPassword("123");
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFullName() {
        CustomerDTO instance = new CustomerDTO();
        instance.setFullName("Full Name");
        String expResult = "Full Name";
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFullName() {
        CustomerDTO instance = new CustomerDTO();
        instance.setFullName("Full Name");
        String expResult = "Full Name";
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAddressId() {
        CustomerDTO instance = new CustomerDTO();
        instance.setAddressId(2);
        int expResult = 2;
        int result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddressId() {
        CustomerDTO instance = new CustomerDTO();
        instance.setAddressId(2);
        int expResult = 2;
        int result = instance.getAddressId();
        assertEquals(expResult, result);
    }
    
}
