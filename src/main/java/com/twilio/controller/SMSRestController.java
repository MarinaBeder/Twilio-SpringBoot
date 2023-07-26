package com.twilio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.request.SMSSendRequest;
import com.twilio.service.SMSService;

@RestController
@RequestMapping("/api")

public class SMSRestController {
	@Autowired
	SMSService smsService;

	@PostMapping("/processSMS")
	public String processSMS(@RequestBody SMSSendRequest sendRequest) {

		return smsService.sendSMS(sendRequest.getDestinationSMSNumber(), sendRequest.getSmsMessage());
	}

}