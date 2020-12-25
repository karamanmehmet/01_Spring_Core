package com.cybertek.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.cybertek.implementation.BankingServiceInternational;
import com.cybertek.interfaces.BankingService;
import com.cybertek.repo.AccountRepository;

@Configuration
@ComponentScan(basePackages = "com.cybertek")
@PropertySource(value = {"classpath:application.properties"})
public class AppConfig {
	
	
	@Bean
	public BankingService bankingServiceInt() {
		
		return new BankingServiceInternational(new AccountRepository());
	}

}
