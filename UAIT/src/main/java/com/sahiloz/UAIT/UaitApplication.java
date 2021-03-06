package com.sahiloz.UAIT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value={"classpath:messages.properties"})
public class UaitApplication {

	public static void main(String[] args) {
		SpringApplication.run(UaitApplication.class, args);
	}
}
