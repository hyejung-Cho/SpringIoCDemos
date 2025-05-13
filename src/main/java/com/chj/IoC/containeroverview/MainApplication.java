package com.chj.IoC.containeroverview;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chj.IoC.containeroverview.config.AppConfig;
import com.chj.IoC.containeroverview.service.PetStoreServiceImpl;


public class MainApplication {
    public static void main(String[] args) {
    	// 제어의 역전
    	// Spring container에게 위임하겠다는 의미
    	// ApplicationContext -> interface
    	// 느슨한 결합 ( 추상화 --> 추상클래스와 인터페이스)
		ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);
		                                             //AppConfig.class는
		                                             //byte code로 생성된 것
		                                             //runtime() 시간까지 유지

        PetStoreServiceImpl petStoreService =
        		// 가상(추상) 메서드
        		// instance가 있으면 그것을 달라고 함
        		context.getBean(PetStoreServiceImpl.class);
        
        // petStoreService를 사용하여 비즈니스 로직 수행
        petStoreService.addItem("dog");
    }
}