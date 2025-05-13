package com.chj.IoC.breanoverview.service;

import org.springframework.context.annotation.Bean;

import com.chj.IoC.breanoverview.dao.AccountDao;

public class ClientServiceImpl  {
	// dependency
    private AccountDao accountDao;
    
    public ClientServiceImpl(AccountDao accountDao) {
    	this.accountDao = accountDao;
		System.out.println(">>>>>>>>>>>>> contructor of ClientServiceImpl ");
	}

    public ClientServiceImpl() {
    	System.out.println("****************** default Constructor" );
    }
    
    public AccountDao accountDao() {
        this.accountDao = new AccountDao();
        return this.accountDao;
    }
    
    // Setters for dependency injection
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    
}
