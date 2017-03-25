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
        System.out.println("getLogId");
        LogDTO instance = new LogDTO();
        Integer expResult = null;
        Integer result = instance.getLogId();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetLogId() {
        System.out.println("setLogId");
        Integer logId = null;
        LogDTO instance = new LogDTO();
        instance.setLogId(logId);
    }

    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        LogDTO instance = new LogDTO();
        String expResult = null;
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = null;
        LogDTO instance = new LogDTO();
        instance.setTitle(title);
    }

    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        LogDTO instance = new LogDTO();
        String expResult = null;
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = null;
        LogDTO instance = new LogDTO();
        instance.setMessage(message);
    }
    
}
