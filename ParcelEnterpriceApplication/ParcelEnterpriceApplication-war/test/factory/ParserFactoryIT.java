package factory;

import org.junit.Test;
import static org.junit.Assert.*;
import uk.co.giovannilenguito.dto.AddressDTO;
import uk.co.giovannilenguito.dto.CustomerDTO;
import uk.co.giovannilenguito.dto.DriverDTO;
import uk.co.giovannilenguito.dto.LocationDTO;
import uk.co.giovannilenguito.dto.LogDTO;
import uk.co.giovannilenguito.dto.ParcelDTO;
import uk.co.giovannilenguito.entities.Address;
import uk.co.giovannilenguito.entities.Customer;
import uk.co.giovannilenguito.entities.Driver;
import uk.co.giovannilenguito.entities.Location;
import uk.co.giovannilenguito.entities.Log;
import uk.co.giovannilenguito.entities.Parcel;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class ParserFactoryIT {
    
    public ParserFactoryIT() {
    }

    @Test
    public void testGetInstance() {
        ParserFactory expResult = ParserFactory.getInstance();
        ParserFactory result = ParserFactory.getInstance();
        assertEquals(expResult, result);
    }

    @Test
    public void testAddressToEntity() {
        AddressDTO dtoObj = new AddressDTO();
        ParserFactory instance = ParserFactory.getInstance();
        Address expResult = new Address();
        Address result = instance.addressToEntity(dtoObj);
        assertEquals(expResult, result);
    }

    @Test
    public void testCustomerToEntity() {
        CustomerDTO dtoObj = new CustomerDTO();
        Address address = new Address();
        ParserFactory instance = ParserFactory.getInstance();
        Customer expResult = new Customer();
        Customer result = instance.customerToEntity(dtoObj, address);
        assertEquals(expResult, result);
    }

    @Test
    public void testDriverToEntity() {
        DriverDTO dtoObj = new DriverDTO();
        ParserFactory instance = ParserFactory.getInstance();
        Driver expResult = new Driver();
        Driver result = instance.driverToEntity(dtoObj);
        assertEquals(expResult, result);
    }

    @Test
    public void testLocationToEntity() {
        LocationDTO dtoObj = new LocationDTO();
        ParserFactory instance = ParserFactory.getInstance();
        Location expResult = new Location();
        Location result = instance.locationToEntity(dtoObj);
        assertEquals(expResult, result);
    }

    @Test
    public void testParcelToEntity() {
        ParcelDTO dtoObj = new ParcelDTO();
        Address address = new Address();
        Customer customer = new Customer();
        Driver driver = new Driver();
        Location location = new Location();
        
        ParserFactory instance = ParserFactory.getInstance();
        Parcel expResult = new Parcel();
        expResult.setParcelId(0);
        Parcel result = instance.parcelToEntity(dtoObj, address, customer, driver, location);
        assertEquals(expResult, result);
    }

    @Test
    public void testLogToEntity() {
        LogDTO dtoObj = new LogDTO();
        Customer customer = new Customer();
        Driver driver = new Driver();
        
        ParserFactory instance = ParserFactory.getInstance();
        Log expResult = new Log();
        Log result = instance.logToEntity(dtoObj, customer, driver);
        assertEquals(expResult, result);
    }
    
}
