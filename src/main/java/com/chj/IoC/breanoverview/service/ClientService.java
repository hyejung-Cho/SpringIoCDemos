package com.chj.IoC.breanoverview.service;

import com.chj.IoC.breanoverview.dao.AccountDao;

public class ClientService {
	private AccountDao accountDao;
    private ClientService clientInstance;

    public ClientService() {}
    
	public ClientService(AccountDao accountDao) {
		System.out.println("ClientService created. default Constructor");
	}
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public ClientService createClientServiceInstance() {
		if(this.clientInstance == null) {
			this.clientInstance = new ClientService();
		}
		
		System.out.println("****** ClientService created Instance.");
		
		return this.clientInstance;
	}
	
	public ClientService createAccountServiceInstance() {
		if(this.clientInstance == null) {
			this.clientInstance = new ClientService();
		}
		System.out.println("****** AccountService created instance.");
		return this.clientInstance;
	}
}
