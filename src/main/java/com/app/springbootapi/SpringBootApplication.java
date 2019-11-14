package com.app.springbootapi;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@EnableJpaAuditing
@SpringBootApplication
public class SpringBootApplication extends SpringBootServletInitializer {
  
	public static void main (String args []) {
		SpringApplication.run(SpringBootApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure (SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(SpringBootApplication.class);
	}
	
	
}
