package com.vesg.springframework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Cizim {

	public static void main(String[] args){
		
		ClassPathResource classPathResource=new ClassPathResource("spring.xml");
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		
		Ucgen ucgen=beanFactory.getBean("ucgen",Ucgen.class);
		ucgen.ciz();
	}
}
