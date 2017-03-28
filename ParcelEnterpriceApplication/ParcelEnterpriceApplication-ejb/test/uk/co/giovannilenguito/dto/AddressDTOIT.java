package uk.co.giovannilenguito.dto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class AddressDTOIT {
    
    public AddressDTOIT() {
    }

    @Test
    public void testGetAddressId() {
        AddressDTO instance = new AddressDTO();
        instance.setAddressId(1);
        Integer expResult = 1;
        Integer result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddressId() {
        AddressDTO instance = new AddressDTO();
        instance.setAddressId(1);
        Integer expResult = 1;
        Integer result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLineOne() {
        AddressDTO instance = new AddressDTO();
        instance.setLineOne("Line One");
        String expResult = "Line One";
        String result = instance.getLineOne();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLineOne() {
        AddressDTO instance = new AddressDTO();
        instance.setLineOne("Line One");
        String expResult = "Line One";
        String result = instance.getLineOne();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLineTwo() {
        AddressDTO instance = new AddressDTO();
        instance.setLineTwo("Line Two");
        String expResult = "Line Two";
        String result = instance.getLineTwo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLineTwo() {
        AddressDTO instance = new AddressDTO();
        instance.setLineTwo("Line Two");
        String expResult = "Line Two";
        String result = instance.getLineTwo();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCity() {
        AddressDTO instance = new AddressDTO();
        instance.setCity("City");
        String expResult = "City";
        String result = instance.getCity();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCity() {
        AddressDTO instance = new AddressDTO();
        instance.setCity("City");
        String expResult = "City";
        String result = instance.getCity();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPostcode() {
        AddressDTO instance = new AddressDTO();
        instance.setPostcode("Postcode");
        String expResult = "Postcode";
        String result = instance.getPostcode();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPostcode() {
        AddressDTO instance = new AddressDTO();
        instance.setPostcode("Postcode");
        String expResult = "Postcode";
        String result = instance.getPostcode();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCountry() {
        AddressDTO instance = new AddressDTO();
        instance.setCountry("Country");
        String expResult = "Country";
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCountry() {
        AddressDTO instance = new AddressDTO();
        instance.setCountry("Country");
        String expResult = "Country";
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }
    
}
