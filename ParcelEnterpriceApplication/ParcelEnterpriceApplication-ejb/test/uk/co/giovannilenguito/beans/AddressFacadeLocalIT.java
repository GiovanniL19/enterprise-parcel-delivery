/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.giovannilenguito.beans;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import uk.co.giovannilenguito.entities.Address;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class AddressFacadeLocalIT {
    
    public AddressFacadeLocalIT() {
    }

    @Test
    public void testCreate() {
        System.out.println("create");
        Address address = null;
        AddressFacadeLocal instance = new AddressFacadeLocalImpl();
        instance.create(address);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreateAddress() {
        System.out.println("createAddress");
        Address address = null;
        AddressFacadeLocal instance = new AddressFacadeLocalImpl();
        int expResult = 0;
        int result = instance.createAddress(address);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        Address address = null;
        AddressFacadeLocal instance = new AddressFacadeLocalImpl();
        instance.edit(address);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        Address address = null;
        AddressFacadeLocal instance = new AddressFacadeLocalImpl();
        instance.remove(address);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFind() {
        System.out.println("find");
        Object id = null;
        AddressFacadeLocal instance = new AddressFacadeLocalImpl();
        Address expResult = null;
        Address result = instance.find(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        AddressFacadeLocal instance = new AddressFacadeLocalImpl();
        List<Address> expResult = null;
        List<Address> result = instance.findAll();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindRange() {
        System.out.println("findRange");
        int[] range = null;
        AddressFacadeLocal instance = new AddressFacadeLocalImpl();
        List<Address> expResult = null;
        List<Address> result = instance.findRange(range);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    public class AddressFacadeLocalImpl implements AddressFacadeLocal {

        public void create(Address address) {
        }

        public int createAddress(Address address) {
            return 0;
        }

        public void edit(Address address) {
        }

        public void remove(Address address) {
        }

        public Address find(Object id) {
            return null;
        }

        public List<Address> findAll() {
            return null;
        }

        public List<Address> findRange(int[] range) {
            return null;
        }
    }
    
}
