package com.juaracoding.shop_demoqa.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${name}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	@Value("${email}")
	private String email;
	
	@Value("${itemsearch}")
	private String itemsearch;

	public String getBrowser() {
		return browser;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getItemsearch() {
		return itemsearch;
	}
	
	
	
}
