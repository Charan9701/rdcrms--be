package com.pst.rdcrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pst.rdcrms.request.EmailRequest;
import com.pst.rdcrms.service.EmailService;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class EmailController {
	
	@Autowired
	private EmailService emailService;

	@PostMapping
	public String sendEMail(@RequestBody EmailRequest emailRequest) {
		try {
			emailService.sendSimpleEmail(emailRequest);
			return "Email sent to: " + emailRequest.getToEmail();
		} catch (Exception e) {
			return "Failed to send email: " + e.getMessage();
		}
	}

}
