package com.cybertek.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cybertek.interfaces.BankingService;
import com.cybertek.interfaces.DataSource;
import com.cybertek.repo.AccountRepository;



@Component
public class BankingServiceDomestic implements BankingService {

	@Autowired
	AccountRepository repo;

	
	@Autowired
	@Qualifier("myDataSource")
	DataSource dataSource;
	
	
	/*
	@Value("${java.home}")
	private String javaHome;
	*/
	
	
	private @Value("${account.type}") String type;

	

	public void createAccount() {
		System.out.println("-------------------------------------------");
		repo.getAccountInfo();
		System.out.println("-------------------------------------------");

		dataSource.getConnection();
		//System.out.println("Java Home : "+javaHome);
		System.out.println();

		System.out.println("-------------------------------------------");
		System.out.println("US - Financial validation businees flow");
		System.out.println(type+" Debit Account has been created");
		System.out.println("-------------------------------------------");

	}

}
