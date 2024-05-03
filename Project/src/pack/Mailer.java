package pack;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
public class Mailer {
	public static void send(String to,String subject,String msg){ 

		  String host="smtp.gmail.com";
		  final String user="rockstar996633@gmail.com";//change accordingly
		  final String password="8977775484";//change accordingly
		  
		   to="rockstar996633@gmail.com";//change accordingly

		   Properties props = new Properties();
		   props.put("mail.smtp.host",host);
		   props.put("mail.smtp.auth","true");
		 //props.put("mail.smtp.auth","true");
		   props.put("mail.smtp.starttls.enable","true");
		     props.put("mail.smtp.host",host);
		    props.put("mail.smtp.port","587");
		   
		   Session session = Session.getDefaultInstance(props,
				   new javax.mail.Authenticator() {
		      @Override
			protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(user,password);
		      }
		    });
		    try {
		     MimeMessage message = new MimeMessage(session);
		     message.setFrom(new InternetAddress(user));
		     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
		     message.setSubject("Registration Confirmed");
		     message.setText("Registration have been done successfully");
		     Transport.send(message);

		     System.out.println("message sent successfully...");
		 
		     } catch (MessagingException e) {e.printStackTrace();}
		 }
}
