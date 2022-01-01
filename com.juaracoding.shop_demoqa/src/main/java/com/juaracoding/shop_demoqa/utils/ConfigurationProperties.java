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
	
	@Value("${firstname}")
	private String firstname;
	
	@Value("${lastname}")
	private String lastname;
	
	@Value("${country}")
	private String country;
	
	@Value("${address}")
	private String address;
	
	@Value("${city}")
	private String city;
	
	@Value("${province}")
	private String province;
	
	@Value("${postcode}")
	private String postcode;
	
	@Value("${phone}")
	private String phone;

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

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getCountry() {
		return country;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getProvince() {
		return province;
	}

	public String getPostcode() {
		return postcode;
	}

	public String getPhone() {
		return phone;
	}
	
	
	
}
