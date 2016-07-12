package com.vesg.springframework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Cizim {

	public static void main(String[] args){
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Ucgen ucgen=context.getBean("ucgen",Ucgen.class);
		ucgen.ciz();
	}
}
