package com.cybertek;

import com.cybertek.implementation.BankingServiceDomestic;
import com.cybertek.interfaces.BankingService;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	BankingServiceDomestic dom=new BankingServiceDomestic();
	//	dom.creteAccount();
		
		
	//	BankingServiceInternational intern=new BankingServiceInternational();
		
	//	intern.creteAccount();
		
		
		BankingService bs=new BankingServiceDomestic();
		bs.createAccount();
	}

}
