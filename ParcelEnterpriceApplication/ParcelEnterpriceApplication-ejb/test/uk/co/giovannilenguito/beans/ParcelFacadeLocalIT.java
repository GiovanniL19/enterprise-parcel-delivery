/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.giovannilenguito.beans;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import uk.co.giovannilenguito.entities.Parcel;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class ParcelFacadeLocalIT {
    
    public ParcelFacadeLocalIT() {
    }

    @Test
    public void testCreate() {
        System.out.println("create");
        Parcel parcel = null;
        ParcelFacadeLocal instance = new ParcelFacadeLocalImpl();
        instance.create(parcel);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        Parcel parcel = null;
        ParcelFacadeLocal instance = new ParcelFacadeLocalImpl();
        instance.edit(parcel);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        Parcel parcel = null;
        ParcelFacadeLocal instance = new ParcelFacadeLocalImpl();
        instance.remove(parcel);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFind() {
        System.out.println("find");
        Object id = null;
        ParcelFacadeLocal instance = new ParcelFacadeLocalImpl();
        Parcel expResult = null;
        Parcel result = instance.find(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByCustomer() {
        System.out.println("findByCustomer");
        Object id = null;
        ParcelFacadeLocal instance = new ParcelFacadeLocalImpl();
        List<Parcel> expResult = null;
        List<Parcel> result = instance.findByCustomer(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByDriver() {
        System.out.println("findByDriver");
        Object id = null;
        ParcelFacadeLocal instance = new ParcelFacadeLocalImpl();
        List<Parcel> expResult = null;
        List<Parcel> result = instance.findByDriver(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        ParcelFacadeLocal instance = new ParcelFacadeLocalImpl();
        List<Parcel> expResult = null;
        List<Parcel> result = instance.findAll();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindRange() {
        System.out.println("findRange");
        int[] range = null;
        ParcelFacadeLocal instance = new ParcelFacadeLocalImpl();
        List<Parcel> expResult = null;
        List<Parcel> result = instance.findRange(range);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCount() {
        System.out.println("count");
        ParcelFacadeLocal instance = new ParcelFacadeLocalImpl();
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    public class ParcelFacadeLocalImpl implements ParcelFacadeLocal {

        public void create(Parcel parcel) {
        }

        public void edit(Parcel parcel) {
        }

        public void remove(Parcel parcel) {
        }

        public Parcel find(Object id) {
            return null;
        }

        public List<Parcel> findByCustomer(Object id) {
            return null;
        }

        public List<Parcel> findByDriver(Object id) {
            return null;
        }

        public List<Parcel> findAll() {
            return null;
        }

        public List<Parcel> findRange(int[] range) {
            return null;
        }

        public int count() {
            return 0;
        }
    }
    
}
