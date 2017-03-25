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
import uk.co.giovannilenguito.dto.LogDTO;
import uk.co.giovannilenguito.entities.Log;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class LogFacadeRESTIT {
    
    public LogFacadeRESTIT() {
    }

    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        LogDTO dtoObj = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LogFacadeREST instance = (LogFacadeREST)container.getContext().lookup("java:global/classes/LogFacadeREST");
        instance.create(dtoObj);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        int id = 0;
        LogDTO dtoObj = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LogFacadeREST instance = (LogFacadeREST)container.getContext().lookup("java:global/classes/LogFacadeREST");
        instance.edit(id, dtoObj);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        int id = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LogFacadeREST instance = (LogFacadeREST)container.getContext().lookup("java:global/classes/LogFacadeREST");
        instance.remove(id);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        int id = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LogFacadeREST instance = (LogFacadeREST)container.getContext().lookup("java:global/classes/LogFacadeREST");
        Log expResult = null;
        Log result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LogFacadeREST instance = (LogFacadeREST)container.getContext().lookup("java:global/classes/LogFacadeREST");
        List<Log> expResult = null;
        List<Log> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        fail("The test case is a prototype.");
    }
    
}
