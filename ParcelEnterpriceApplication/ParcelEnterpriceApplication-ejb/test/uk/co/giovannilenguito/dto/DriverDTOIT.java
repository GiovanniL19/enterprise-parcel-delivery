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
    public void testGetDriverId() {
        System.out.println("getDriverId");
        DriverDTO instance = new DriverDTO();
        Integer expResult = null;
        Integer result = instance.getDriverId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDriverId() {
        System.out.println("setDriverId");
        Integer driverId = null;
        DriverDTO instance = new DriverDTO();
        instance.setDriverId(driverId);
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        DriverDTO instance = new DriverDTO();
        String expResult = null;
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = null;
        DriverDTO instance = new DriverDTO();
        instance.setEmail(email);
    }

    @Test
    public void testGetContactNumber() {
        System.out.println("getContactNumber");
        DriverDTO instance = new DriverDTO();
        String expResult = null;
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetContactNumber() {
        System.out.println("setContactNumber");
        String contactNumber = null;
        DriverDTO instance = new DriverDTO();
        instance.setContactNumber(contactNumber);
    }

    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        DriverDTO instance = new DriverDTO();
        String expResult = null;
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = null;
        DriverDTO instance = new DriverDTO();
        instance.setUsername(username);
    }

    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        DriverDTO instance = new DriverDTO();
        String expResult = null;
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = null;
        DriverDTO instance = new DriverDTO();
        instance.setPassword(password);
    }

    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        DriverDTO instance = new DriverDTO();
        String expResult = null;
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = null;
        DriverDTO instance = new DriverDTO();
        instance.setFullName(fullName);
    }
    
}
