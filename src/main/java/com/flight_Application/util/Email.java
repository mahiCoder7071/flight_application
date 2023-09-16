package com.flight_Application.util;


import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class Email {
	@Autowired
    private JavaMailSender sender;
	public void SendMessage(String toAddress,String filepath)
	{
		 MimeMessage message = sender.createMimeMessage();

        		 try {
				MimeMessageHelper content=new MimeMessageHelper(message,true);
				content.setTo(toAddress);
			content.setSubject("Itinerary Of Flight");
			content.setText("Please find the attached");
			content.addAttachment("Itinerray", new File(filepath));
			sender.send(message);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


