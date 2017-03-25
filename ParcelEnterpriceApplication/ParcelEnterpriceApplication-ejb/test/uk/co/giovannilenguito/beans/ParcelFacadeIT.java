/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.giovannilenguito.beans;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.Test;
import static org.junit.Assert.*;
import uk.co.giovannilenguito.entities.Address;
import uk.co.giovannilenguito.entities.Location;
import uk.co.giovannilenguito.entities.Parcel;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class ParcelFacadeIT {
    
    public ParcelFacadeIT() {
    }

    @Test
    public void testCreateLocation() throws Exception {
        System.out.println("createLocation");
        Location entity = null;
        ParcelFacade instance = new ParcelFacade();
        int expResult = 0;
        int result = instance.createLocation(entity);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreateAddress() throws Exception {
        System.out.println("createAddress");
        Address entity = null;
        ParcelFacade instance = new ParcelFacade();
        int expResult = 0;
        int result = instance.createAddress(entity);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Parcel entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeLocal instance = (ParcelFacadeLocal)container.getContext().lookup("java:global/classes/ParcelFacade");
        instance.create(entity);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Parcel entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeLocal instance = (ParcelFacadeLocal)container.getContext().lookup("java:global/classes/ParcelFacade");
        instance.edit(entity);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Parcel entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeLocal instance = (ParcelFacadeLocal)container.getContext().lookup("java:global/classes/ParcelFacade");
        instance.remove(entity);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeLocal instance = (ParcelFacadeLocal)container.getContext().lookup("java:global/classes/ParcelFacade");
        Parcel expResult = null;
        Parcel result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByUsername() throws Exception {
        System.out.println("findByUsername");
        Object username = null;
        ParcelFacade instance = new ParcelFacade();
        Parcel expResult = null;
        Parcel result = instance.findByUsername(username);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByCustomer() throws Exception {
        System.out.println("findByCustomer");
        Object customer = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeLocal instance = (ParcelFacadeLocal)container.getContext().lookup("java:global/classes/ParcelFacade");
        List<Parcel> expResult = null;
        List<Parcel> result = instance.findByCustomer(customer);
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByDriver() throws Exception {
        System.out.println("findByDriver");
        Object driver = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeLocal instance = (ParcelFacadeLocal)container.getContext().lookup("java:global/classes/ParcelFacade");
        List<Parcel> expResult = null;
        List<Parcel> result = instance.findByDriver(driver);
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeLocal instance = (ParcelFacadeLocal)container.getContext().lookup("java:global/classes/ParcelFacade");
        List<Parcel> expResult = null;
        List<Parcel> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeLocal instance = (ParcelFacadeLocal)container.getContext().lookup("java:global/classes/ParcelFacade");
        List<Parcel> expResult = null;
        List<Parcel> result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeLocal instance = (ParcelFacadeLocal)container.getContext().lookup("java:global/classes/ParcelFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }
    
}
