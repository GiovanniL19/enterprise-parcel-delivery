/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.giovannilenguito.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class ParcelIT {
    private Parcel parcel = null;
    
    public ParcelIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        parcel = new Parcel();
        parcel.setParcelId(1);
        parcel.setServiceType("First Class");
        parcel.setContents("Test package");
        parcel.setDateBooked("12/03/2017");
        parcel.setDeliveryDate("20/03/2017");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getParcelId method, of class Parcel.
     */
    @Test
    public void testGetParcelId() {
        System.out.println("getParcelId");
        int expResult = 1;
        int result = parcel.getParcelId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setParcelId method, of class Parcel.
     */
    @Test
    public void testSetParcelId() {
        System.out.println("setParcelId");
        int expResult = 5;
        parcel.setParcelId(5);
        int result = parcel.getParcelId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getServiceType method, of class Parcel.
     */
    @Test
    public void testGetServiceType() {
        System.out.println("getServiceType");
        String expResult = "First Class";
        String result = parcel.getServiceType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setServiceType method, of class Parcel.
     */
    @Test
    public void testSetServiceType() {
        System.out.println("setServiceType");
        parcel.setServiceType("Second Class");
        String expResult = "Second Class";
        String result = parcel.getServiceType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getContents method, of class Parcel.
     */
    @Test
    public void testGetContents() {
        System.out.println("getContents");
        String expResult = "Test package";
        String result = parcel.getContents();
        assertEquals(expResult, result);
    }

    /**
     * Test of setContents method, of class Parcel.
     */
    @Test
    public void testSetContents() {
        System.out.println("setContents");
        parcel.setContents("Large Package");
        String expResult = "Large Package";
        String result = parcel.getContents();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateBooked method, of class Parcel.
     */
    @Test
    public void testGetDateBooked() {
        System.out.println("getDateBooked");
        String expResult = "12/03/2017";
        String result = parcel.getDateBooked();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateBooked method, of class Parcel.
     */
    @Test
    public void testSetDateBooked() {
        System.out.println("setDateBooked");
        parcel.setDateBooked("15/03/2017");
        String expResult = "15/03/2017";
        String result = parcel.getDateBooked();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDeliveryDate method, of class Parcel.
     */
    @Test
    public void testGetDeliveryDate() {
        System.out.println("getDeliveryDate");
        String expResult = "20/03/2017";
        String result = parcel.getDeliveryDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDeliveryDate method, of class Parcel.
     */
    @Test
    public void testSetDeliveryDate() {
        System.out.println("setDeliveryDate");
        parcel.setDeliveryDate("25/03/2017");
        String expResult = "25/03/2017";
        String result = parcel.getDeliveryDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCollectionLineOne method, of class Parcel.
     */
    @Test
    public void testGetCollectionLineOne() {
        System.out.println("getCollectionLineOne");
        Parcel instance = new Parcel();
        String expResult = null;
        String result = instance.getCollectionLineOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCollectionLineOne method, of class Parcel.
     */
    @Test
    public void testSetCollectionLineOne() {
        System.out.println("setCollectionLineOne");
        String collectionLineOne = "";
        Parcel instance = new Parcel();
        instance.setCollectionLineOne(collectionLineOne);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCollectionPostcode method, of class Parcel.
     */
    @Test
    public void testGetCollectionPostcode() {
        System.out.println("getCollectionPostcode");
        Parcel instance = new Parcel();
        String expResult = null;
        String result = instance.getCollectionPostcode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCollectionPostcode method, of class Parcel.
     */
    @Test
    public void testSetCollectionPostcode() {
        System.out.println("setCollectionPostcode");
        String collectionPostcode = "";
        Parcel instance = new Parcel();
        instance.setCollectionPostcode(collectionPostcode);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAddressId method, of class Parcel.
     */
    @Test
    public void testGetAddressId() {
        System.out.println("getAddressId");
        Parcel instance = new Parcel();
        Address expResult = null;
        Address result = instance.getAddressId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAddressId method, of class Parcel.
     */
    @Test
    public void testSetAddressId() {
        System.out.println("setAddressId");
        Address addressId = null;
        Parcel instance = new Parcel();
        instance.setAddressId(addressId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerId method, of class Parcel.
     */
    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        Parcel instance = new Parcel();
        Customer expResult = null;
        Customer result = instance.getCustomerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerId method, of class Parcel.
     */
    @Test
    public void testSetCustomerId() {
        System.out.println("setCustomerId");
        Customer customerId = null;
        Parcel instance = new Parcel();
        instance.setCustomerId(customerId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDriverId method, of class Parcel.
     */
    @Test
    public void testGetDriverId() {
        System.out.println("getDriverId");
        Parcel instance = new Parcel();
        Driver expResult = null;
        Driver result = instance.getDriverId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDriverId method, of class Parcel.
     */
    @Test
    public void testSetDriverId() {
        System.out.println("setDriverId");
        Driver driverId = null;
        Parcel instance = new Parcel();
        instance.setDriverId(driverId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLocationId method, of class Parcel.
     */
    @Test
    public void testGetLocationId() {
        System.out.println("getLocationId");
        Parcel instance = new Parcel();
        Location expResult = null;
        Location result = instance.getLocationId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLocationId method, of class Parcel.
     */
    @Test
    public void testSetLocationId() {
        System.out.println("setLocationId");
        Location locationId = null;
        Parcel instance = new Parcel();
        instance.setLocationId(locationId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Parcel.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Parcel instance = new Parcel();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Parcel.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Parcel instance = new Parcel();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Parcel.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "uk.co.giovannilenguito.entities.Parcel[ parcelId=" + parcel.getParcelId() + " ]";
        String result = parcel.toString();
        assertEquals(expResult, result);
    }
    
}
