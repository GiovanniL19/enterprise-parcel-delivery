/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.giovannilenguito.beans;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import uk.co.giovannilenguito.entities.Customer;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class CustomerFacadeLocalIT {
    
    public CustomerFacadeLocalIT() {
    }

    @Test
    public void testCreate() {
        System.out.println("create");
        Customer customer = null;
        CustomerFacadeLocal instance = new CustomerFacadeLocalImpl();
        instance.create(customer);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        Customer customer = null;
        CustomerFacadeLocal instance = new CustomerFacadeLocalImpl();
        instance.edit(customer);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        Customer customer = null;
        CustomerFacadeLocal instance = new CustomerFacadeLocalImpl();
        instance.remove(customer);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFind() {
        System.out.println("find");
        Object id = null;
        CustomerFacadeLocal instance = new CustomerFacadeLocalImpl();
        Customer expResult = null;
        Customer result = instance.find(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByUsername() {
        System.out.println("findByUsername");
        Object username = null;
        CustomerFacadeLocal instance = new CustomerFacadeLocalImpl();
        Customer expResult = null;
        Customer result = instance.findByUsername(username);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        CustomerFacadeLocal instance = new CustomerFacadeLocalImpl();
        List<Customer> expResult = null;
        List<Customer> result = instance.findAll();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindRange() {
        System.out.println("findRange");
        int[] range = null;
        CustomerFacadeLocal instance = new CustomerFacadeLocalImpl();
        List<Customer> expResult = null;
        List<Customer> result = instance.findRange(range);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCount() {
        System.out.println("count");
        CustomerFacadeLocal instance = new CustomerFacadeLocalImpl();
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    public class CustomerFacadeLocalImpl implements CustomerFacadeLocal {

        public void create(Customer customer) {
        }

        public void edit(Customer customer) {
        }

        public void remove(Customer customer) {
        }

        public Customer find(Object id) {
            return null;
        }

        public Customer findByUsername(Object username) {
            return null;
        }

        public List<Customer> findAll() {
            return null;
        }

        public List<Customer> findRange(int[] range) {
            return null;
        }

        public int count() {
            return 0;
        }
    }
    
}
