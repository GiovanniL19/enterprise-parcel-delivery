package uk.co.giovannilenguito.dto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class DriverDTOIT {
    
    public DriverDTOIT() {
    }

    @Test
    public void testGetDriverDTOId() {
        DriverDTO instance = new DriverDTO();
        instance.setDriverId(3);
        
        Integer expResult = 3;
        Integer result = instance.getDriverId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDriverDTOId() {
        DriverDTO instance = new DriverDTO();
        instance.setDriverId(3);
        
        Integer expResult = 3;
        Integer result = instance.getDriverId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetEmail() {
        DriverDTO instance = new DriverDTO();
        instance.setEmail("DriverDTO@email.com");
        
        String expResult = "DriverDTO@email.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() {
        DriverDTO instance = new DriverDTO();
        instance.setEmail("DriverDTO@email.com");
        
        String expResult = "DriverDTO@email.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetContactNumber() {
        DriverDTO instance = new DriverDTO();
        instance.setContactNumber("0123456789");
        
        String expResult = "0123456789";
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetContactNumber() {
        DriverDTO instance = new DriverDTO();
        instance.setContactNumber("0123456789");
        
        String expResult = "0123456789";
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetUsername() {
        DriverDTO instance = new DriverDTO();
        instance.setUsername("UserName");
        
        String expResult = "UserName";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUsername() {
        DriverDTO instance = new DriverDTO();
        instance.setUsername("UserName");
        
        String expResult = "UserName";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPassword() {
        DriverDTO instance = new DriverDTO();
        instance.setPassword("123");
        
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPassword() {
        DriverDTO instance = new DriverDTO();
        instance.setPassword("123");
        
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFullName() {
        DriverDTO instance = new DriverDTO();
        instance.setFullName("Full Name");
        
        String expResult = "Full Name";
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFullName() {
        DriverDTO instance = new DriverDTO();
        instance.setFullName("Full Name");
        
        String expResult = "Full Name";
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }
    
}
