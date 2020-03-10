package com.pj.propertiesdemo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource(value = "classpath:email.properties")
@Configuration
@Data
public class EmailPropertiesConfig
{
	private Environment environment;

	@Autowired
	public EmailPropertiesConfig(Environment environment)
	{
		this.environment = environment;
	}

	@Bean
	public EmailProperties emailProperties()
	{
		EmailProperties emailProperties=new EmailProperties();
		emailProperties.setTo(environment.getProperty("to",""));
		emailProperties.setFrom(environment.getProperty("from",""));
		emailProperties.setReplyTo(environment.getProperty("replyTo",""));
		return emailProperties;
	}
}
