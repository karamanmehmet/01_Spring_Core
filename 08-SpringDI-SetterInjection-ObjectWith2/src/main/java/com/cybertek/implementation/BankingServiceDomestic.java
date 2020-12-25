package com.cybertek.implementation;

import com.cybertek.interfaces.BankingService;
import com.cybertek.repo.AccountRepository;

public class BankingServiceDomestic implements BankingService {

	AccountRepository repo;

	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}

	public void createAccount() {
		System.out.println("-------------------------------------------");
		repo.getAccountInfo();
		System.out.println("-------------------------------------------");

		System.out.println();

		System.out.println("-------------------------------------------");
		System.out.println("US - Financial validation businees flow");
		System.out.println("Domestic Debit Account has been created");
		System.out.println("-------------------------------------------");

	}

}
