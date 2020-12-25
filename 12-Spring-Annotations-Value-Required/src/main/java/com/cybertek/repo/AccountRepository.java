package com.cybertek.repo;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class AccountRepository {

	// int accountId;

	private int accountId;
	private String accountName;

	
	@Value("${xaccountRepository.accountId}")
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	@Required
	@Value("${xaccountRepository.accountName}")
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void getAccountInfo() {

		System.out.println("Account Id : " + this.accountId + " Name :" + this.accountName);
	}
}
