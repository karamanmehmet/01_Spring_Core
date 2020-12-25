package com.cybertek.implementation;

import com.cybertek.interfaces.BankingService;

public class BankingServiceDomestic implements BankingService{
	
	
	public BankingServiceDomestic() {
		
		System.out.println("Constructor - BankingServiceDomestic");
	}
	
	public void createAccount() {
		
		
		System.out.println("-------------------------------------------");
		System.out.println("US - Financial validation businees flow");
		System.out.println("Domestic Account has been created");
		System.out.println("-------------------------------------------");
		
	}

}
