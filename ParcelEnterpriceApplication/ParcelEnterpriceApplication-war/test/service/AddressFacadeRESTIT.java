/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import uk.co.giovannilenguito.beans.AddressFacadeLocal;
import uk.co.giovannilenguito.entities.Address;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class AddressFacadeRESTIT {

    public AddressFacadeRESTIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class AddressFacadeREST.
     */
    @Test
    public void testCreate() throws Exception {
        //System.out.println("create");
//        Address entity = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AddressFacadeREST instance = (AddressFacadeREST)container.getContext().lookup("java:global/classes/AddressFacadeREST");
//        instance.create(entity);
//        container.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class AddressFacadeREST.
     */
    @Test
    public void testEdit() throws Exception {
//        System.out.println("edit");
//        Integer id = null;
//        Address entity = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AddressFacadeREST instance = (AddressFacadeREST)container.getContext().lookup("java:global/classes/AddressFacadeREST");
//        instance.edit(id, entity);
//        container.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AddressFacadeREST.
     */
    @Test
    public void testRemove() throws Exception {
//        System.out.println("remove");
//        Integer id = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AddressFacadeREST instance = (AddressFacadeREST)container.getContext().lookup("java:global/classes/AddressFacadeREST");
//        instance.remove(id);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class AddressFacadeREST.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Integer id = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        AddressFacadeREST instance = (AddressFacadeREST)container.getContext().lookup("java:global/ParcelEnterpriceApplication/ParcelEnterpriceApplication-war/AddressFacadeREST!service.AddressFacadeREST");
        
        Address expResult = null;
        Address result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class AddressFacadeREST.
     */
    @Test
    public void testFindAll() throws Exception {
//        System.out.println("findAll");
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        AddressFacadeREST instance = (AddressFacadeREST)container.getContext().lookup("java:global/classes/AddressFacadeREST");
//        List<Address> expResult = null;
//        List<Address> result = instance.findAll();
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    
}
