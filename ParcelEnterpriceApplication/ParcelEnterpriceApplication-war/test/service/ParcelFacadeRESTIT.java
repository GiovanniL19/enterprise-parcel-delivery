/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.Test;
import static org.junit.Assert.*;
import uk.co.giovannilenguito.dto.ParcelDTO;
import uk.co.giovannilenguito.entities.Parcel;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class ParcelFacadeRESTIT {
    
    public ParcelFacadeRESTIT() {
    }

    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        ParcelDTO dtoObj = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeREST instance = (ParcelFacadeREST)container.getContext().lookup("java:global/classes/ParcelFacadeREST");
        instance.create(dtoObj);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Integer id = null;
        ParcelDTO dtoObj = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeREST instance = (ParcelFacadeREST)container.getContext().lookup("java:global/classes/ParcelFacadeREST");
        instance.edit(id, dtoObj);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Integer id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeREST instance = (ParcelFacadeREST)container.getContext().lookup("java:global/classes/ParcelFacadeREST");
        instance.remove(id);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByCustomer() throws Exception {
        System.out.println("findByCustomer");
        int id = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeREST instance = (ParcelFacadeREST)container.getContext().lookup("java:global/classes/ParcelFacadeREST");
        List<Parcel> expResult = null;
        List<Parcel> result = instance.findByCustomer(id);
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByDriver() throws Exception {
        System.out.println("findByDriver");
        int id = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeREST instance = (ParcelFacadeREST)container.getContext().lookup("java:global/classes/ParcelFacadeREST");
        List<Parcel> expResult = null;
        List<Parcel> result = instance.findByDriver(id);
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        int id = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeREST instance = (ParcelFacadeREST)container.getContext().lookup("java:global/classes/ParcelFacadeREST");
        Parcel expResult = null;
        Parcel result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        ParcelFacadeREST instance = (ParcelFacadeREST)container.getContext().lookup("java:global/classes/ParcelFacadeREST");
        List<Parcel> expResult = null;
        List<Parcel> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }
    
}
