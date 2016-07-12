package com.vesg.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		Selam selam=applicationContext.getBean("selam",Selam.class);
		selam.goster();
		
		//((AbstractApplicationContext)applicationContext).registerShutdownHook();

	}
}