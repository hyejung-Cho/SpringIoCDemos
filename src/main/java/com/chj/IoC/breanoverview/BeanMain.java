package com.chj.IoC.breanoverview;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chj.IoC.breanoverview.config.DefaultServiceLocator;
import com.chj.IoC.breanoverview.service.ClientService;
import com.chj.IoC.breanoverview.service.ClientServiceImpl;

public class BeanMain {

	public static void main(String[] args) {
		// java 기반에 injection
		ApplicationContext context = 
        		new AnnotationConfigApplicationContext(DefaultServiceLocator.class);
		
		ClientServiceImpl  clientServiceImpl =
        		// 가상(추상) 메서드
        		// instance가 있으면 그것을 달라고 함
        		context.getBean(ClientServiceImpl.class);
	}

}
