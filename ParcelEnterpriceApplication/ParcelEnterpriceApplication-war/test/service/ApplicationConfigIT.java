package service;

import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class ApplicationConfigIT {
    
    public ApplicationConfigIT() {
    }

    @Test
    public void testGetClasses() {
        System.out.println("getClasses");
        ApplicationConfig instance = new ApplicationConfig();
        Set<Class<?>> expResult = new java.util.HashSet<>();
        
        expResult.add(AddressFacadeREST.class);
        expResult.add(CustomerFacadeREST.class);
        expResult.add(DriverFacadeREST.class);
        expResult.add(LocationFacadeREST.class);
        expResult.add(LogFacadeREST.class);
        expResult.add(ParcelFacadeREST.class);
        
        Set<Class<?>> result = instance.getClasses();
        assertEquals(expResult, result);
    }
    
}