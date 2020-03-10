package com.pj.propertiesdemo.config;

import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = "classpath:email.properties")
@Configuration
@Data
public class EmailProperties
{
	private String to;
	private String from;
	private String replyTo;
}
