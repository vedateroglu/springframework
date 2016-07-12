package com.vesg.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		Selam selam1=applicationContext.getBean("selam",Selam.class);
		selam1.setMesaj("Merhaba Dünya");
		selam1.goster();
		
		Selam selam2=applicationContext.getBean("selam",Selam.class);
		//selam2.setMesaj("Merhaba Dünya 2");
		selam2.goster();
		
		System.out.println(selam1);
		System.out.println(selam2);
	}

}
