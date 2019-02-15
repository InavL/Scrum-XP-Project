/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;


import java.util.Date;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;



/**
 *
 * @author sadeerbedan
 */
public class SendEmail {
    
    public static void main(String args []) {
    
    try{
    String host = "smtp.gmail.com";
    String user = "mailoruis@gmail.com";
    String pass = "javagrupp1";
    String to = "lovasol@live.se";
    String from = "mailoruis@gmail.com";
    String subject = "enkelt meddelande";
    String messageText = "testar detta!!!";
    boolean sessionDebug = false;
      
    Properties props = System.getProperties();
    
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.host", host);
    props.put("mail.smtp.port", "587");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.required", "true" );
     
    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
    
    Session mailSession = Session.getDefaultInstance(props, null);
    
    mailSession.setDebug(sessionDebug);
    Message msg = new MimeMessage(mailSession);
    msg.setFrom(new InternetAddress(from));
    InternetAddress[] address = {new InternetAddress(to)};


    msg.setRecipients(Message.RecipientType.TO, address); 
    msg.setSubject(subject);
    msg.setSentDate(new Date());
    msg.setText(messageText);
    
    Transport transport = mailSession.getTransport("smtp");
    transport.connect(host, user, pass);
    transport.sendMessage(msg, msg.getAllRecipients());
    transport.close();
    System.out.println("message send sucessfully");
    } catch(Exception ex)
    {
        System.out.println(ex);
        
            }
    }}