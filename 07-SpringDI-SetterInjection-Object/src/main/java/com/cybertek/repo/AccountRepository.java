package com.cybertek.repo;

public class AccountRepository {

	// int accountId;

	private int accountId;
	private String accountName;

	public AccountRepository(int accountId, String accountName) {

		this.accountId = accountId;
		this.accountName = accountName;
	}

	public void getAccountInfo() {

		System.out.println("Account Id : " + this.accountId + " Name :" + this.accountName);
	}
}
