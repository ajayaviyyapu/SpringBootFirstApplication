package com.ajayspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@RequestMapping("/sendMessage")
	public String sendMessage()
	{
		return "Success Message";
	}

}
