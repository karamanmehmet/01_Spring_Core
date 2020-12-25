package com.cybertek.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cybertek.interfaces.DataSource;

@Component
public class AccountRepository {

	

	
	
	
	// int accountId;

	private int accountId;
	private String accountName;

	
	@Value("${xaccountRepository.accountId}")
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	//@Required
	@Value("${xaccountRepository.accountName}")
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void getAccountInfo() {
		
		

		System.out.println("Account Id : " + this.accountId + " Name :" + this.accountName);
	}
}
