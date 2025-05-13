package com.chj.IoC.breanoverview.service;

public class AccountService {
	private AccountService accountInstance;
	
	public AccountService createAccountServiceInstance() {
		if(this.accountInstance == null) {
			this.accountInstance = new AccountService();
		}
		System.out.println("****** AccountService created instance.");
		return this.accountInstance;
	}

//	public AccountService() {
//        System.out.println("AccountService created. default Constructor");
//    }
}
