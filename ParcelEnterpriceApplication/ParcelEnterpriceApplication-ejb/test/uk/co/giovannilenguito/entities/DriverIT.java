/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.giovannilenguito.entities;

import java.util.Collection;
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
        System.out.println("getDriverId");
        Driver instance = new Driver();
        Integer expResult = null;
        Integer result = instance.getDriverId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDriverId() {
        System.out.println("setDriverId");
        Integer driverId = null;
        Driver instance = new Driver();
        instance.setDriverId(driverId);
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Driver instance = new Driver();
        String expResult = null;
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = null;
        Driver instance = new Driver();
        instance.setEmail(email);
    }

    @Test
    public void testGetContactNumber() {
        System.out.println("getContactNumber");
        Driver instance = new Driver();
        String expResult = null;
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetContactNumber() {
        System.out.println("setContactNumber");
        String contactNumber = null;
        Driver instance = new Driver();
        instance.setContactNumber(contactNumber);
    }

    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Driver instance = new Driver();
        String expResult = null;
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = null;
        Driver instance = new Driver();
        instance.setUsername(username);
    }

    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Driver instance = new Driver();
        String expResult = null;
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = null;
        Driver instance = new Driver();
        instance.setPassword(password);
    }

    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Driver instance = new Driver();
        String expResult = null;
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = null;
        Driver instance = new Driver();
        instance.setFullName(fullName);
    }

    @Test
    public void testGetParcelCollection() {
        System.out.println("getParcelCollection");
        Driver instance = new Driver();
        Collection<Parcel> expResult = null;
        Collection<Parcel> result = instance.getParcelCollection();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetParcelCollection() {
        System.out.println("setParcelCollection");
        Collection<Parcel> parcelCollection = null;
        Driver instance = new Driver();
        instance.setParcelCollection(parcelCollection);
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Driver instance = new Driver();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Driver instance = new Driver();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Driver instance = new Driver();
        String expResult = "uk.co.giovannilenguito.entities.Driver[ driverId=" + null + " ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
