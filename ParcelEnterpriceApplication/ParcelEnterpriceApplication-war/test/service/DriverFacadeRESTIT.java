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
import uk.co.giovannilenguito.dto.DriverDTO;
import uk.co.giovannilenguito.entities.Driver;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class DriverFacadeRESTIT {
    
    public DriverFacadeRESTIT() {
    }

    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        DriverDTO dtoObj = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        DriverFacadeREST instance = (DriverFacadeREST)container.getContext().lookup("java:global/classes/DriverFacadeREST");
        instance.create(dtoObj);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        int id = 0;
        DriverDTO dtoObj = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        DriverFacadeREST instance = (DriverFacadeREST)container.getContext().lookup("java:global/classes/DriverFacadeREST");
        instance.edit(id, dtoObj);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        int id = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        DriverFacadeREST instance = (DriverFacadeREST)container.getContext().lookup("java:global/classes/DriverFacadeREST");
        instance.remove(id);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        int id = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        DriverFacadeREST instance = (DriverFacadeREST)container.getContext().lookup("java:global/classes/DriverFacadeREST");
        Driver expResult = null;
        Driver result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByUsername() throws Exception {
        System.out.println("findByUsername");
        String username = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        DriverFacadeREST instance = (DriverFacadeREST)container.getContext().lookup("java:global/classes/DriverFacadeREST");
        Driver expResult = null;
        Driver result = instance.findByUsername(username);
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        DriverFacadeREST instance = (DriverFacadeREST)container.getContext().lookup("java:global/classes/DriverFacadeREST");
        List<Driver> expResult = null;
        List<Driver> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRandom() throws Exception {
        System.out.println("random");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        DriverFacadeREST instance = (DriverFacadeREST)container.getContext().lookup("java:global/classes/DriverFacadeREST");
        Driver expResult = null;
        Driver result = instance.random();
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }
    
}
