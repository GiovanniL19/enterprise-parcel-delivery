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
import uk.co.giovannilenguito.dto.LocationDTO;
import uk.co.giovannilenguito.entities.Location;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class LocationFacadeRESTIT {
    
    public LocationFacadeRESTIT() {
    }

    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        LocationDTO dtoObj = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LocationFacadeREST instance = (LocationFacadeREST)container.getContext().lookup("java:global/classes/LocationFacadeREST");
        int expResult = 0;
        int result = instance.create(dtoObj);
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        int id = 0;
        LocationDTO dtoObj = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LocationFacadeREST instance = (LocationFacadeREST)container.getContext().lookup("java:global/classes/LocationFacadeREST");
        instance.edit(id, dtoObj);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        int id = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LocationFacadeREST instance = (LocationFacadeREST)container.getContext().lookup("java:global/classes/LocationFacadeREST");
        instance.remove(id);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        int id = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LocationFacadeREST instance = (LocationFacadeREST)container.getContext().lookup("java:global/classes/LocationFacadeREST");
        Location expResult = null;
        Location result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LocationFacadeREST instance = (LocationFacadeREST)container.getContext().lookup("java:global/classes/LocationFacadeREST");
        List<Location> expResult = null;
        List<Location> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }
    
}
