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
        System.out.println("getAddressId");
        AddressDTO instance = new AddressDTO();
        Integer expResult = null;
        Integer result = instance.getAddressId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetAddressId() {
        System.out.println("setAddressId");
        Integer addressId = null;
        AddressDTO instance = new AddressDTO();
        instance.setAddressId(addressId);
    }

    @Test
    public void testGetLineOne() {
        System.out.println("getLineOne");
        AddressDTO instance = new AddressDTO();
        String expResult = null;
        String result = instance.getLineOne();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLineOne() {
        System.out.println("setLineOne");
        String lineOne = "";
        AddressDTO instance = new AddressDTO();
        instance.setLineOne(lineOne);
    }

    @Test
    public void testGetLineTwo() {
        System.out.println("getLineTwo");
        AddressDTO instance = new AddressDTO();
        String expResult = null;
        String result = instance.getLineTwo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLineTwo() {
        System.out.println("setLineTwo");
        String lineTwo = "";
        AddressDTO instance = new AddressDTO();
        instance.setLineTwo(lineTwo);
    }

    @Test
    public void testGetCity() {
        System.out.println("getCity");
        AddressDTO instance = new AddressDTO();
        String expResult = null;
        String result = instance.getCity();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "";
        AddressDTO instance = new AddressDTO();
        instance.setCity(city);
    }

    @Test
    public void testGetPostcode() {
        System.out.println("getPostcode");
        AddressDTO instance = new AddressDTO();
        String expResult = null;
        String result = instance.getPostcode();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPostcode() {
        System.out.println("setPostcode");
        String postcode = "";
        AddressDTO instance = new AddressDTO();
        instance.setPostcode(postcode);
    }

    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        AddressDTO instance = new AddressDTO();
        String expResult = null;
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "";
        AddressDTO instance = new AddressDTO();
        instance.setCountry(country);
    }
    
}
