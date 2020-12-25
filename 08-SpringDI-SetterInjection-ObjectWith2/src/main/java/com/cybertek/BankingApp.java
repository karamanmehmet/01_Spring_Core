package com.cybertek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cybertek.implementation.BankingServiceDomestic;
import com.cybertek.implementation.BankingServiceInternational;
import com.cybertek.interfaces.BankingService;
import com.cybertek.repo.AccountRepository;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       
		

		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		BankingService bs=context.getBean("bankingService",BankingServiceDomestic.class);
		bs.createAccount();	
		
		BankingService bankingInt=context.getBean("bankingServiceInt",BankingServiceInternational.class);
		bankingInt.createAccount();	
		
		
	}

}
