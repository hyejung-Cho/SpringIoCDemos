package com.chj.IoC.containeroverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chj.IoC.containeroverview.dao.AccountDao;
import com.chj.IoC.containeroverview.dao.ItemDao;
import com.chj.IoC.containeroverview.service.PetStoreServiceImpl;

@Configuration
public class ServiceConfig {

    @Bean
    public PetStoreServiceImpl petStoreService(AccountDao accountDao, ItemDao itemDao) {
        PetStoreServiceImpl petStoreService = new PetStoreServiceImpl();
        petStoreService.setAccountDao(accountDao);
        petStoreService.setItemDao(itemDao);
        // 추가 설정이 있다면 여기에 작성
        return petStoreService;
    }

    // 필요한 다른 서비스 Bean을 정의합니다.
}