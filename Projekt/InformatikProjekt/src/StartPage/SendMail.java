/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

/**
 *
 * @author ellin
 */
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class SendMail {


    public static void sendMail(String to, String sub,String msg, final String user, final String pass){
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");	
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        Session session = Session.getDefaultInstance(props,new Authenticator() 
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(user, pass);
            }
        });

        try {
            Message message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(sub);
            message.setText(msg);

          Transport.send(message);
          
          JOptionPane.showMessageDialog(null, "Email notifications are sent");

        } catch (MessagingException oneException)  {

            System.out.println(oneException.getMessage());
            throw new RuntimeException(oneException);
        }
    }
}

//Loopa genom listan med de som vill ha mailnotiser
        //  String email = idb.fetchRows("Select EMAIL from PERSONER");

        

        //SendMail.sendMail("ellinor_danielsson@hotmail.com", "New meeting", "You are invited to a new meeting.", "mailoruis@gmail.com", "javagrupp1");
