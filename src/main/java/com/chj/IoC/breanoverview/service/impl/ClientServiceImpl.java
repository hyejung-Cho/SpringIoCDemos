package com.chj.IoC.breanoverview.service.impl;

import com.chj.IoC.breanoverview.dao.AccountDao;
import com.chj.IoC.breanoverview.service.ClientService;

public class ClientServiceImpl extends ClientService {	
	private AccountDao accountDao;
    private ClientService clientInstance;

    public ClientServiceImpl() {
    	createClientServiceInstance();
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
	
	// Business methods
    public void addAccount(String account) {
        System.out.println("Adding account: " + account);
        accountDao.saveAccount(account);
    }

    public String fetchAccount(String accountId) {
        System.out.println("Fetching account with ID: " + accountId);
        return accountDao.getAccount(accountId);
    }
}
