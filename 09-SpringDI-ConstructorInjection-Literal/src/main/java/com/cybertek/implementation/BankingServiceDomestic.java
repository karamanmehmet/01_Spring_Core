package com.cybertek.implementation;

import com.cybertek.interfaces.BankingService;
import com.cybertek.repo.AccountRepository;

public class BankingServiceDomestic implements BankingService{
	
	
	
	
	
	
	public void createDebitAccount() {
	
		System.out.println("-------------------------------------------");
		AccountRepository ar =new AccountRepository();
		ar.setAccountId(12345);
		
		ar.getAccountInfo();
		System.out.println("-------------------------------------------");
		
		System.out.println();
		
		System.out.println("-------------------------------------------");
		System.out.println("US - Financial validation businees flow");
		System.out.println("Domestic Debit Account has been created");
		System.out.println("-------------------------------------------");
		
	}

	public void createAccount() {
		// TODO Auto-generated method stub
		
	}

}
