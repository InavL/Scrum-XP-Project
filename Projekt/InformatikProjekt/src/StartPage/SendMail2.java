/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author YLIT
 */
public class SendMail2 {



public class UsableSendMail {

    String HOST;
    String USER_NAME;
    String PASSWORD;
    String RECIPIENT[];
    String SUBJECT;
    String BODY;

    public UsableSendMail(String HOST, String USER_NAME,
            String PASSWORD,
            String RECIPIENT[],
            String SUBJECT,
            String BODY) {
        this.HOST=HOST;
        this.USER_NAME = USER_NAME;
        this.PASSWORD = PASSWORD;
        this.RECIPIENT = RECIPIENT;
        this.SUBJECT = SUBJECT;
        this.BODY = BODY;
    }

    public void sendFromGMail() {
        Properties props = System.getProperties();
        String host = HOST;
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", "mailoruis@gmail.com");
        props.put("mail.smtp.password", "javagrupp1");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress("irmelilova@gmail.com"));
            InternetAddress[] toAddress = new InternetAddress[RECIPIENT.length];

            // To get the array of addresses
            for( int i = 0; i < RECIPIENT.length; i++ ) {
                toAddress[i] = new InternetAddress(RECIPIENT[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(SUBJECT);
            message.setText(BODY);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, USER_NAME, PASSWORD);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }
}
}
    
