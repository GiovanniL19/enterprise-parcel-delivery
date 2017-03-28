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
        Log instance = new Log();
        instance.setLogId(5);
        Integer expResult = 5;
        Integer result = instance.getLogId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLogId() {
        Log instance = new Log();
        instance.setLogId(5);
        Integer expResult = 5;
        Integer result = instance.getLogId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTitle() {
        Log instance = new Log();
        instance.setTitle("Title");
        String expResult = "Title";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTitle() {
        Log instance = new Log();
        instance.setTitle("Title");
        String expResult = "Title";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMessage() {
        Log instance = new Log();
        instance.setMessage("Message");
        String expResult = "Message";
        String result = instance.getMessage();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetMessage() {
        Log instance = new Log();
        instance.setMessage("Message");
        String expResult = "Message";
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }

    @Test
    public void testHashCode() {
        Log instance = new Log();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals() {
        Object object = null;
        Log instance = new Log();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        Log instance = new Log();
        String expResult = "uk.co.giovannilenguito.entities.Log[ logId=" + null + " ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
