package com.cybertek.repo;

public class AccountRepository {

	
	
	//int accountId;
	
	private int accountId;
	private String accountName;
	
	
	
	
	
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}





	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}





	public void getAccountInfo() {
		
		
		System.out.println("Account Id : "+this.accountId + " Name :"+this.accountName);
	}
}
