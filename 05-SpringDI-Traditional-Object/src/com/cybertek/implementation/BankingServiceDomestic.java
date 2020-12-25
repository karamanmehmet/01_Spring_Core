package com.cybertek.implementation;

import com.cybertek.repo.AccountRepository;

public class BankingServiceDomestic{
	
	
	
	AccountRepository repo =new AccountRepository();
	
	
	public void createDebitAccount() {
		
		
		repo.setAccountId(145);
		
		
		repo.getAccountInfo();
		
		System.out.println("-------------------------------------------");
		System.out.println("US - Financial validation businees flow");
		System.out.println("Domestic Debit Account has been created");
		System.out.println("-------------------------------------------");
		
	}

}
