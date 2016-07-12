package com.vesg.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		ISelam selam=applicationContext.getBean("selam",ISelam.class);
		selam.mesajYaz("Güzel gören, güzel düşünür.\nGüzel düşünen hayatından lezzet alır.");
	}

}
