package com.grwts.prop.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "details.emp")
public class PropertiesConfiguration {
	private String id;
	private String name;
	private String city;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public PropertiesConfiguration(String id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public PropertiesConfiguration() {
		super();
	}
	
	
	
	

}
