package com.project.PropertyFile.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.project.PropertyFile.model.TestDataAppProp;

@Configuration
//@PropertySource("classpath:application.properties")
public class PropertyConfigApplicationProperties {
	
	@Value("${test.app.prop.username}")
	private String username;
	@Value("${test.app.prop.password}")
	private String password;
	
	@Bean
	public TestDataAppProp testAppProp() {
		TestDataAppProp testDataAppProp = new TestDataAppProp(username, password);
		return testDataAppProp;
	}
	
	
}

