package com.project.PropertyFile.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.project.PropertyFile.model.TestDataA;
import com.project.PropertyFile.model.TestDataB;

@Configuration
// USED WHEN WE WANT TO READ FROM PROPERTY FILE OTHER THAN THE DEFAULT APPLICATION.PROPERTIES
@PropertySources({ 
	@PropertySource("classpath:testA.properties"), 
	@PropertySource("classpath:testB.properties") 
	})
public class PropertyConfigCustomDefined {

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}

	@Value("${test.user}")
	private String testUserNameA;
	@Value("${test.password}")
	private String testPasswordA;

	@Value("${test.user}")
	private String testUserNameB;
	@Value("${test.password}")
	private String testPasswordB;

	@Bean
	public TestDataA testValueA() {
		TestDataA td = new TestDataA(testUserNameA, testPasswordA);
		return td;

	}

	@Bean
	public TestDataB testValueB() {
		TestDataB td = new TestDataB(testUserNameB, testPasswordB);
		return td;
	}

}
