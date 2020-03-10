package com.pj.propertiesdemo.web;

import com.pj.propertiesdemo.config.EmailProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/email")
public class EmailPropertiesController
{
	private final EmailProperties emailProperties;

	public EmailPropertiesController(EmailProperties emailProperties)
	{
		this.emailProperties = emailProperties;
	}

	@GetMapping("/get/all")
	public EmailProperties getAllEmailProperties()
	{
		return emailProperties;
	}
}
