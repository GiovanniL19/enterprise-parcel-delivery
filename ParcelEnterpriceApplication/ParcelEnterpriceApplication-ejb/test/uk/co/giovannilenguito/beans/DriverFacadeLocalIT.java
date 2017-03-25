/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.giovannilenguito.beans;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import uk.co.giovannilenguito.entities.Driver;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class DriverFacadeLocalIT {
    
    public DriverFacadeLocalIT() {
    }

    @Test
    public void testCreate() {
        System.out.println("create");
        Driver driver = null;
        DriverFacadeLocal instance = new DriverFacadeLocalImpl();
        instance.create(driver);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        Driver driver = null;
        DriverFacadeLocal instance = new DriverFacadeLocalImpl();
        instance.edit(driver);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        Driver driver = null;
        DriverFacadeLocal instance = new DriverFacadeLocalImpl();
        instance.remove(driver);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFind() {
        System.out.println("find");
        Object id = null;
        DriverFacadeLocal instance = new DriverFacadeLocalImpl();
        Driver expResult = null;
        Driver result = instance.find(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByUsername() {
        System.out.println("findByUsername");
        Object username = null;
        DriverFacadeLocal instance = new DriverFacadeLocalImpl();
        Driver expResult = null;
        Driver result = instance.findByUsername(username);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        DriverFacadeLocal instance = new DriverFacadeLocalImpl();
        List<Driver> expResult = null;
        List<Driver> result = instance.findAll();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindRange() {
        System.out.println("findRange");
        int[] range = null;
        DriverFacadeLocal instance = new DriverFacadeLocalImpl();
        List<Driver> expResult = null;
        List<Driver> result = instance.findRange(range);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCount() {
        System.out.println("count");
        DriverFacadeLocal instance = new DriverFacadeLocalImpl();
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    public class DriverFacadeLocalImpl implements DriverFacadeLocal {

        public void create(Driver driver) {
        }

        public void edit(Driver driver) {
        }

        public void remove(Driver driver) {
        }

        public Driver find(Object id) {
            return null;
        }

        public Driver findByUsername(Object username) {
            return null;
        }

        public List<Driver> findAll() {
            return null;
        }

        public List<Driver> findRange(int[] range) {
            return null;
        }

        public int count() {
            return 0;
        }
    }
    
}
