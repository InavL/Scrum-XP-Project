/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import java.util.*;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
 
/**
 *https://buddhimawijeweera.wordpress.com/2011/02/09/sendreceiveemailsjava/ 
 * deras: https://pastebin.com/GKKgXqnk?fbclid=IwAR1e4V286JfiYCNxZwx4IitO4FO9Es7e86MfMZNROEHFLGt_0bNHnadZ3VE
 */
public class SendEmail {
 
    private String anvandarnamn;
    private String losenord;
    private String skickaHost;
    private int skickaPort;
    private String fran;
    private String till;
    private String amne;
    private String text;
 
    //UPPDATERAR KONTOUPPGIFTER
    public void sattKontoUppgifter(String anvandarnamn, String losenord) {
 
        //UPPDATERAR FÄLTEN MED INPAR
        this.anvandarnamn = anvandarnamn;
        this.losenord = losenord;
 
    }
 
    //SKICKAR UT MAIL TILL ANVÄNDARE FRÅN JAVAGRUPP2@GMAIL.COM
    public void skickaGmail(String fran, String till, String amne, String text) {
 
        //UPPDATERAR FÄLTEN MED INPAR
        this.fran = fran;
        this.till = till;
        this.amne = amne;
        this.text = text;
 
        //GMAIL HOST OCH GMAIL PORT
        this.skickaHost = "smtp.gmail.com";
        this.skickaPort = 465;
 
        Properties props = new Properties();
        props.put("mail.smtp.host", this.skickaHost);
        props.put("mail.smtp.port", String.valueOf(this.skickaPort));
        props.put("mail.smtp.user", this.anvandarnamn);
        props.put("mail.smtp.password", this.losenord);
        props.put("mail.smtp.auth", "true");
        Session session1 = Session.getDefaultInstance(props);
        Message simpleMessage = new MimeMessage(session1); //MIME stands for Multipurpose Internet Mail Extensions        
        InternetAddress fromAddress = null;
        InternetAddress toAddress = null;
 
        try {
            fromAddress = new InternetAddress(this.fran);
            toAddress = new InternetAddress(this.till);
 
        } catch (AddressException e) {
            e.printStackTrace();
        }
 
        try {
 
            simpleMessage.setFrom(fromAddress);
            simpleMessage.setRecipient(RecipientType.TO, toAddress);
            simpleMessage.setSubject(this.amne);
            simpleMessage.setText(this.text);
            Transport transport = session1.getTransport("smtps");
            transport.connect(this.skickaHost, skickaPort, this.anvandarnamn, this.losenord);
            transport.sendMessage(simpleMessage, simpleMessage.getAllRecipients());
            transport.close();
 
        } catch (MessagingException e) {
 
            e.printStackTrace();
        }
 
    }
 
    //LOGGAR IN PÅ KONTOT FÖR ATT KUNNA SKICKA MAIL
    public static void start (String[] args) {
 
        String mailFran = new String("mailoruis@gmail.com");
        String mailTill = new String ("lovasol@live.se");  //skriv i vem det ska va till
 
        //INLOGGNINGSUPPGIFTER TILL ANVSÄNDARENS MAIL
        String senderPassword = new String("javagrupp1");
        String senderUserName = new String("java grupp 1");
 
        
        String amne = new String("Testing Mail");
        
        String mailText = new String("Have an Nice Day .!!!");
        
        //SKAPAR ETT OBJEKT AV EN GMAILCLIENT
        SendEmail newGmailClient = new SendEmail();
        //SÄTTER KONTOUPPGIFTER
        newGmailClient.sattKontoUppgifter(senderUserName, senderPassword);
        //SKICKAR GMAIL MED METODEN SKICKAGMAIL:S INFO
        newGmailClient.skickaGmail(mailFran, mailTill , amne, mailText);
 
    }
 
}
