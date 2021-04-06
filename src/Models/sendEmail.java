/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.ActivationDataFlavor.*;

public class sendEmail {
       public static String receiverEmail;
       
       public sendEmail(String receiverEmail)
       {
          this.receiverEmail=receiverEmail;
       }
       
       public static void main(String[] args) {
        String to=receiverEmail;
        String from="managementCompany2018@gmail.com";
        Properties properties=new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port",587);
        
        Session session=Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("managementCompany2018@gmail.com","admin123**");
            }
            
            
        });
        
        try{
            MimeMessage message= new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject(" project status ");
            message.setText("Your project is complete");
            Transport.send(message);
                    
        }catch(MessagingException mex)
        {
           mex.printStackTrace();
        }
    }
    
}
