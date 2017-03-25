/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.giovannilenguito.beans;

import java.util.List;
import javax.persistence.EntityManager;
import org.junit.Test;
import static org.junit.Assert.*;
import uk.co.giovannilenguito.entities.Address;
import uk.co.giovannilenguito.entities.Location;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class AbstractFacadeIT {
    
    public AbstractFacadeIT() {
    }

    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        AbstractFacade instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreateLocation() {
        System.out.println("createLocation");
        Location entity = null;
        AbstractFacade instance = null;
        int expResult = 0;
        int result = instance.createLocation(entity);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreateAddress() {
        System.out.println("createAddress");
        Address entity = null;
        AbstractFacade instance = null;
        int expResult = 0;
        int result = instance.createAddress(entity);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreate() {
        System.out.println("create");
        Object entity = null;
        AbstractFacade instance = null;
        instance.create(entity);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        Object entity = null;
        AbstractFacade instance = null;
        instance.edit(entity);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        Object entity = null;
        AbstractFacade instance = null;
        instance.remove(entity);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFind() {
        System.out.println("find");
        Object id = null;
        AbstractFacade instance = null;
        Object expResult = null;
        Object result = instance.find(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByUsername() {
        System.out.println("findByUsername");
        Object username = null;
        AbstractFacade instance = null;
        Object expResult = null;
        Object result = instance.findByUsername(username);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByCustomer() {
        System.out.println("findByCustomer");
        Object customer = null;
        AbstractFacade instance = null;
        List expResult = null;
        List result = instance.findByCustomer(customer);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByDriver() {
        System.out.println("findByDriver");
        Object driver = null;
        AbstractFacade instance = null;
        List expResult = null;
        List result = instance.findByDriver(driver);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        AbstractFacade instance = null;
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindRange() {
        System.out.println("findRange");
        int[] range = null;
        AbstractFacade instance = null;
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCount() {
        System.out.println("count");
        AbstractFacade instance = null;
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    public class AbstractFacadeImpl extends AbstractFacade {

        public AbstractFacadeImpl() {
            super(null);
        }

        public EntityManager getEntityManager() {
            return null;
        }
    }
    
}
