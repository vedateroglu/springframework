package com.vesg.springframework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class AppCalistir {

	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		
		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Araba araba=beanFactory.getBean("araba",Araba.class);
		araba.hareketeGec();
	}
}
