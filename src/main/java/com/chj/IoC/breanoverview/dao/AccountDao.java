package com.chj.IoC.breanoverview.dao;

public interface AccountDao {
    void saveAccount(String account);
    String getAccount(String accountId);
}
