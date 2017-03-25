package uk.co.giovannilenguito.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class LogIT {
    
    public LogIT() {
    }

    @Test
    public void testGetLogId() {
        System.out.println("getLogId");
        Log instance = new Log();
        Integer expResult = null;
        Integer result = instance.getLogId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLogId() {
        System.out.println("setLogId");
        Integer logId = null;
        Log instance = new Log();
        instance.setLogId(logId);
    }

    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Log instance = new Log();
        String expResult = null;
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = null;
        Log instance = new Log();
        instance.setTitle(title);
    }

    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Log instance = new Log();
        String expResult = null;
        String result = instance.getMessage();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = null;
        Log instance = new Log();
        instance.setMessage(message);
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Log instance = new Log();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Log instance = new Log();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Log instance = new Log();
        String expResult = "uk.co.giovannilenguito.entities.Log[ logId=" + null + " ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
