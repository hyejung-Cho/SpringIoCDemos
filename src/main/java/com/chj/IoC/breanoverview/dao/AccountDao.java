package com.chj.IoC.breanoverview.dao;

public class AccountDao {
	
	public AccountDao() {}
	
    public void saveAccount(String account) {
        System.out.println("Saving account to the database: " + account);
    }

    public String getAccount(String accountId) {
        System.out.println("Fetching account from the database with ID: " + accountId);
        return "Account_" + accountId; // Dummy data
	    }
}
