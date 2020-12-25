package com.cybertek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cybertek.repo.AccountRepository;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       
		
		//   1
		
		
		/*
		 * BankingServiceDomestic bs=new BankingServiceDomestic();
		 * 
		 * AccountRepository ar=new AccountRepository();
		 * 
		 * ar.getAccountInfo();
		 * 
		 * bs.createDebitAccount();
		 */
		 
		
		// 2 setter start
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		
//		AccountRepository ar=context.getBean("accountRepository",AccountRepository.class);
//		ar.setAccountId(12345);
//		
//		ar.getAccountInfo();
		
		//3
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		AccountRepository ar=context.getBean("accountRepository",AccountRepository.class);
				
		ar.getAccountInfo();
		
		
		
	}

}
