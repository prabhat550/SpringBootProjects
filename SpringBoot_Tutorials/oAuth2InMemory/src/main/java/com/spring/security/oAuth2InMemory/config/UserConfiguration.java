package com.spring.security.oAuth2InMemory.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {

	PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("akhil").password(passwordEncoder.encode("akhil")).roles("ADMIN,USER")
				.authorities("CAN_READ,CAN_WRITE,CAN_DELETE").and().withUser("krishna")
				.password(passwordEncoder.encode("krishna")).roles("USER").authorities("CAN_READ");

	}

}
