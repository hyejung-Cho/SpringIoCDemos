package com.chj.IoC.containeroverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.chj.IoC.containeroverview.dao.AccountDao;
import com.chj.IoC.containeroverview.dao.ItemDao;
import com.chj.IoC.containeroverview.dao.jpa.JpaAccountDao;
import com.chj.IoC.containeroverview.dao.jpa.JpaItemDao;
import com.chj.IoC.containeroverview.service.PetStoreServiceImpl;

// Java based Configuration Metadata
@Configuration
@Import({ServiceConfig.class, DaoConfig.class})
public class AppConfig {
    // 통합된 설정을 위한 기본 구성 클래스
	
	@Bean
    public JpaAccountDao accountDao() {
        // JpaAccountDao에 필요한 설정을 추가할 수 있습니다.
        return new JpaAccountDao();
    }

    @Bean
    public JpaItemDao itemDao() {
        // JpaItemDao에 필요한 설정을 추가할 수 있습니다.
        return new JpaItemDao();
    }
    
    @Bean
    public PetStoreServiceImpl petStoreService(AccountDao accountDao, ItemDao itemDao) {
    	
    	PetStoreServiceImpl petStoreService = new PetStoreServiceImpl();
    	
    	petStoreService.setAccountDao(accountDao);
    	petStoreService.setItemDao(itemDao);
    	
    	return petStoreService;
    }
}