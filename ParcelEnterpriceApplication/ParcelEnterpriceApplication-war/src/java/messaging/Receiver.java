package messaging;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.*;
import java.util.Enumeration;
/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */ 
@Stateless
public class Receiver {
 
    @Resource(mappedName = "jms/JMSFactory")
    private ConnectionFactory connectionFactory;
 
    @Resource(mappedName = "jms/messageQueue")
    Queue messageQueue;
    
    private String message;
 
    public String receive() {
        try {
            //Open connection
            Connection connection = connectionFactory.createConnection();
            
            //Create connection
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            
            QueueBrowser queueBrowser = session.createBrowser(messageQueue);
            
            Enumeration enumeration = queueBrowser.getEnumeration();
            //Loop messages recieved
            while (enumeration.hasMoreElements()) {
               TextMessage textMessage = (TextMessage) enumeration.nextElement();
                
               return textMessage.getText();
 
            }
            
            //Close session and connection
            session.close();
            connection.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        //If no messages were found, return null
        return null;
    }
}