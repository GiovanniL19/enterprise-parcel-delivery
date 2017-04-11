package messaging;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.*;

/**
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */


@Stateless
public class Sender {
    @Resource(mappedName = "jms/JMSFactory")
    private ConnectionFactory connectionFactory;

    @Resource(mappedName = "jms/messageQueue")
    Queue messageQueue;

    public void send(String message) {
        MessageProducer messageProducer;
        TextMessage textMessage;
        
        try {
            //Open connection
            Connection connection = connectionFactory.createConnection();
            
            //Create session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            
            messageProducer = session.createProducer(messageQueue);
            
            //Create message
            textMessage = session.createTextMessage();
            textMessage.setText(message);
            messageProducer.send(textMessage);

            //Close producer, session, connection
            messageProducer.close();
            session.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}