package com.cybertek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cybertek.config.AppConfig;
import com.cybertek.implementation.BankingServiceDomestic;
import com.cybertek.implementation.BankingServiceInternational;
import com.cybertek.interfaces.BankingService;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		BankingService bs = context.getBean("bankingServiceDomestic", BankingServiceDomestic.class);
		bs.createAccount();

		
	//	BankingService bankingInt = context.getBean("bankingServiceInt", BankingServiceInternational.class);
	//	bankingInt.createAccount();


	}

}
