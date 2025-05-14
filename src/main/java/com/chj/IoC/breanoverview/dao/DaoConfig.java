package com.chj.IoC.breanoverview.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chj.IoC.breanoverview.dao.jpa.JpaAccountDao2;

@Configuration
public class DaoConfig {

    @Bean
    public JpaAccountDao2 accountDao() {
        // JpaAccountDao에 필요한 설정을 추가할 수 있습니다.
        return new JpaAccountDao2();
    }

}
