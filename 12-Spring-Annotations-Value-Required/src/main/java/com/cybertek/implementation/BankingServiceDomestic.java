package com.cybertek.implementation;

import org.springframework.beans.factory.annotation.Value;

import com.cybertek.interfaces.BankingService;
import com.cybertek.repo.AccountRepository;

public class BankingServiceDomestic implements BankingService {

	AccountRepository repo;

	
	/*
	@Value("${java.home}")
	private String javaHome;
	*/
	
	
	private @Value("${account.type}") String type;

	public BankingServiceDomestic(AccountRepository repo) {
		this.repo = repo;
	}

	public void createAccount() {
		System.out.println("-------------------------------------------");
		repo.getAccountInfo();
		System.out.println("-------------------------------------------");

		
		//System.out.println("Java Home : "+javaHome);
		System.out.println();

		System.out.println("-------------------------------------------");
		System.out.println("US - Financial validation businees flow");
		System.out.println(type+" Debit Account has been created");
		System.out.println("-------------------------------------------");

	}

}
