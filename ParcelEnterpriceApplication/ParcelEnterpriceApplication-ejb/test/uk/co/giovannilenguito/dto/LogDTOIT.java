package uk.co.giovannilenguito.dto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class LogDTOIT {
    
    public LogDTOIT() {
    }

    @Test
    public void testGetLogId() {
        LogDTO instance = new LogDTO();
        instance.setLogId(5);
        Integer expResult = 5;
        Integer result = instance.getLogId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLogId() {
        LogDTO instance = new LogDTO();
        instance.setLogId(5);
        Integer expResult = 5;
        Integer result = instance.getLogId();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTitle() {
        LogDTO instance = new LogDTO();
        instance.setTitle("Title");
        String expResult = "Title";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTitle() {
        LogDTO instance = new LogDTO();
        instance.setTitle("Title");
        String expResult = "Title";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMessage() {
        LogDTO instance = new LogDTO();
        instance.setMessage("Message");
        String expResult = "Message";
        String result = instance.getMessage();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetMessage() {
        LogDTO instance = new LogDTO();
        instance.setMessage("Message");
        String expResult = "Message";
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }
    
}
