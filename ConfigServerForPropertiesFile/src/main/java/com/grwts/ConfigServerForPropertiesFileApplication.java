package com.grwts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class ConfigServerForPropertiesFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerForPropertiesFileApplication.class, args);
	}

}
