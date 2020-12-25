package com.cybertek.implementation;

import com.cybertek.interfaces.BankingService;
import com.cybertek.repo.AccountRepository;

public class BankingServiceInternational implements BankingService {

	AccountRepository repo;

	public BankingServiceInternational(AccountRepository repo) {
		this.repo = repo;
	}

	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------------");
		repo.getAccountInfo();
		System.out.println("-------------------------------------------");

		System.out.println();

		System.out.println("-------------------------------------------");
		System.out.println("International - Financial validation businees flow");
		System.out.println("International Account has been created");
		System.out.println("-------------------------------------------");
	}

}
