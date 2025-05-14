package com.chj.IoC.breanoverview;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chj.IoC.breanoverview.config.DefaultServiceLocator;
import com.chj.IoC.breanoverview.service.impl.ClientServiceImpl;

public class BeanMain {

	public static void main(String[] args) {
		// java 기반에 injection
		AnnotationConfigApplicationContext configContext = new AnnotationConfigApplicationContext(DefaultServiceLocator.class);
		
		//Spring에서는 동일한 ID를 가진 Bean이 중복될 경우 오버라이딩이 발생할 수 있는데, 이것을 방지하기 위해서 사용 
		configContext.getEnvironment().setActiveProfiles("spring.main.allow-bean-definition-overriding", "false");
		
		System.out.println(">>>>>>>>>>>>>>>>> " + configContext.getType("clientService"));
		
		//ApplicationContext context =  new AnnotationConfigApplicationContext(DefaultServiceLocator.class);
		
		ClientServiceImpl  clientServiceImpl =
        		// 가상(추상) 메서드
        		// instance가 있으면 그것을 달라고 함
				configContext.getBean(ClientServiceImpl.class);
		clientServiceImpl.addAccount("call addAccount !! ");
		clientServiceImpl.fetchAccount(" call fetch Account !!! ");
		
		configContext.close();	    
	}

}
