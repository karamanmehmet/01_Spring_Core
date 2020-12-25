package com.cybertek;

import com.cybertek.implementation.BankingServiceDomestic;
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
		 
		
		// 2 setter
		
		
		BankingServiceDomestic bs=new BankingServiceDomestic();
		
		AccountRepository ar=new AccountRepository();
		ar.setAccountId(12345);
		
		ar.getAccountInfo();
		
		bs.createDebitAccount();
		
		
		
	}

}
