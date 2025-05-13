package com.chj.IoC.containeroverview.service;

import com.chj.IoC.containeroverview.dao.AccountDao;
import com.chj.IoC.containeroverview.dao.ItemDao;

public class PetStoreServiceImpl {
	// dependency
    private AccountDao accountDao;
    private ItemDao itemDao;

    // Setters for dependency injection
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
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

    public void addItem(String item) {
        System.out.println("Adding item: " + item);
        itemDao.saveItem(item);
    }

    public String fetchItem(String itemId) {
        System.out.println("Fetching item with ID: " + itemId);
        return itemDao.getItem(itemId);
    }
}






