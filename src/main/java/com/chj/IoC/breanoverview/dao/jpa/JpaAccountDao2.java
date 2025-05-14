package com.chj.IoC.breanoverview.dao.jpa;

import com.chj.IoC.breanoverview.dao.AccountDao;

public class JpaAccountDao2 implements AccountDao {

    @Override
    public void saveAccount(String account) {
        System.out.println("Saving account to the database: " + account);
    }

    @Override
    public String getAccount(String accountId) {
        System.out.println("Fetching account from the database with ID: " + accountId);
        return "Account_" + accountId; // Dummy data
    }
}