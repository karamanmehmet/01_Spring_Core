package com.cybertek.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cybertek.dao.MysqlDataSource;
import com.cybertek.interfaces.BankingService;
import com.cybertek.interfaces.DataSource;
import com.cybertek.repo.AccountRepository;

@Component
public class BankingServiceInternational implements BankingService {

	@Autowired
	AccountRepository repo;
	
	
	@Autowired
	MysqlDataSource mysqlDataSource;

	

	public BankingServiceInternational(AccountRepository repo) {
		this.repo = repo;
		
	}

	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------------");
		repo.getAccountInfo();
		System.out.println("-------------------------------------------");

		System.out.println();
	//	mysqlDataSource.getConnection();

		System.out.println("-------------------------------------------");
		System.out.println("International - Financial validation businees flow");
		System.out.println("International Account has been created");
		System.out.println("-------------------------------------------");
	}

}
