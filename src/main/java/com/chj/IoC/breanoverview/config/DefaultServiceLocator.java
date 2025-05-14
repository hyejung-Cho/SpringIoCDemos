package com.chj.IoC.breanoverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.chj.IoC.breanoverview.dao.AccountDao;
import com.chj.IoC.breanoverview.service.AccountService;
import com.chj.IoC.breanoverview.service.ClientService;
import com.chj.IoC.breanoverview.service.impl.ClientServiceImpl;

@Configuration
@Import({DaoConfig.class})
//@ComponentScan({"com.chj.ioc.dependencies....."})
public class DefaultServiceLocator {

    private static ClientService clientService2 = new ClientService();
    private static AccountService accountService = new AccountService();

    @Bean
    public ClientService createClientServiceInstance() {
    	return clientService2.createClientServiceInstance();
    }

    @Bean
    public AccountService createAccountServiceInstance() {
        return accountService.createAccountServiceInstance();
    }
    
    @Bean
    public ClientServiceImpl clientService(AccountDao accountDao) {    	
    	ClientServiceImpl clientService = new ClientServiceImpl(); 
    	clientService.setAccountDao(accountDao);
    	return clientService;
    }
}