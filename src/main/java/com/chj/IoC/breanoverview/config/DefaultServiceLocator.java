package com.chj.IoC.breanoverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chj.IoC.breanoverview.dao.AccountDao;
import com.chj.IoC.breanoverview.service.AccountService;
import com.chj.IoC.breanoverview.service.ClientService;
import com.chj.IoC.breanoverview.service.ClientServiceImpl;

@Configuration
//@ComponentScan({"com.chj.ioc.dependencies....."})
public class DefaultServiceLocator {
    private static ClientService clientService = new ClientService();
    private static AccountService accountService = new AccountService();
    private static AccountDao accountDao = new AccountDao();

    @Bean
    public ClientService createClientServiceInstance() {
    	return clientService.createClientServiceInstance();
    }

    @Bean
    public AccountService createAccountServiceInstance() {
        return accountService.createAccountServiceInstance();
    }
    
    @Bean
    public ClientServiceImpl clientService(AccountDao accountDao) {
    	ClientServiceImpl clientService = new ClientServiceImpl();
    	clientService.accountDao();
    	System.out.println("AAAAAAAAAAAAA >>>>>>>>>>>>>> " + clientService.accountDao());
        
        return clientService;
    }
}