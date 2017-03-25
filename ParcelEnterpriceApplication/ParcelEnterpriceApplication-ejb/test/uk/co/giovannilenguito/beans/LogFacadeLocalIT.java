/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.giovannilenguito.beans;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import uk.co.giovannilenguito.entities.Log;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class LogFacadeLocalIT {
    
    public LogFacadeLocalIT() {
    }

    @Test
    public void testCreate() {
        System.out.println("create");
        Log log = null;
        LogFacadeLocal instance = new LogFacadeLocalImpl();
        instance.create(log);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        Log log = null;
        LogFacadeLocal instance = new LogFacadeLocalImpl();
        instance.edit(log);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        Log log = null;
        LogFacadeLocal instance = new LogFacadeLocalImpl();
        instance.remove(log);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFind() {
        System.out.println("find");
        Object id = null;
        LogFacadeLocal instance = new LogFacadeLocalImpl();
        Log expResult = null;
        Log result = instance.find(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        LogFacadeLocal instance = new LogFacadeLocalImpl();
        List<Log> expResult = null;
        List<Log> result = instance.findAll();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindRange() {
        System.out.println("findRange");
        int[] range = null;
        LogFacadeLocal instance = new LogFacadeLocalImpl();
        List<Log> expResult = null;
        List<Log> result = instance.findRange(range);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCount() {
        System.out.println("count");
        LogFacadeLocal instance = new LogFacadeLocalImpl();
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    public class LogFacadeLocalImpl implements LogFacadeLocal {

        public void create(Log log) {
        }

        public void edit(Log log) {
        }

        public void remove(Log log) {
        }

        public Log find(Object id) {
            return null;
        }

        public List<Log> findAll() {
            return null;
        }

        public List<Log> findRange(int[] range) {
            return null;
        }

        public int count() {
            return 0;
        }
    }
    
}
