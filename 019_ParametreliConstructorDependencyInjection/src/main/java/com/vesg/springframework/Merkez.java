package com.vesg.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args){
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		B b=applicationContext.getBean("beanB",B.class);
		b.sonucuGoster();
		
		C c=applicationContext.getBean("beanC",C.class);
	}
}
