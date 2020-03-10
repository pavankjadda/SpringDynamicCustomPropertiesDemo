package com.pj.propertiesdemo.config;

import lombok.Data;

@Data
public class EmailProperties
{
	private String to;
	private String from;
	private String replyTo;
}
