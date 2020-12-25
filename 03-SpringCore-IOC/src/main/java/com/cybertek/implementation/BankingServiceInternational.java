package com.cybertek.implementation;

import com.cybertek.interfaces.BankingService;

public class BankingServiceInternational implements BankingService {

	public BankingServiceInternational() {

		System.out.println("Constructor - BankingServiceInternational");
	}

	public void createAccount() {

		System.out.println("-------------------------------------------");
		System.out.println("International - Financial validation businees flow");
		System.out.println("International Account has been created");
		System.out.println("-------------------------------------------");

	}

	// lifecycle methods
	
	
	public void init() throws Exception {
		System.out.println(" Default Init method after properties are set : ");
	}
	

	public void initIt() throws Exception {
		System.out.println("Init method after properties are set : ");
	}

	public void cleanUp() throws Exception {
		System.out.println("Spring Container is destroy! Customer clean up");
	}
}
