/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.giovannilenguito.beans;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import uk.co.giovannilenguito.entities.Location;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class LocationFacadeLocalIT {
    
    public LocationFacadeLocalIT() {
    }

    @Test
    public void testCreateLocation() {
        System.out.println("createLocation");
        Location location = null;
        LocationFacadeLocal instance = new LocationFacadeLocalImpl();
        int expResult = 0;
        int result = instance.createLocation(location);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        Location location = null;
        LocationFacadeLocal instance = new LocationFacadeLocalImpl();
        instance.edit(location);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        Location location = null;
        LocationFacadeLocal instance = new LocationFacadeLocalImpl();
        instance.remove(location);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFind() {
        System.out.println("find");
        Object id = null;
        LocationFacadeLocal instance = new LocationFacadeLocalImpl();
        Location expResult = null;
        Location result = instance.find(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        LocationFacadeLocal instance = new LocationFacadeLocalImpl();
        List<Location> expResult = null;
        List<Location> result = instance.findAll();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindRange() {
        System.out.println("findRange");
        int[] range = null;
        LocationFacadeLocal instance = new LocationFacadeLocalImpl();
        List<Location> expResult = null;
        List<Location> result = instance.findRange(range);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCount() {
        System.out.println("count");
        LocationFacadeLocal instance = new LocationFacadeLocalImpl();
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    public class LocationFacadeLocalImpl implements LocationFacadeLocal {

        public int createLocation(Location location) {
            return 0;
        }

        public void edit(Location location) {
        }

        public void remove(Location location) {
        }

        public Location find(Object id) {
            return null;
        }

        public List<Location> findAll() {
            return null;
        }

        public List<Location> findRange(int[] range) {
            return null;
        }

        public int count() {
            return 0;
        }
    }
    
}
