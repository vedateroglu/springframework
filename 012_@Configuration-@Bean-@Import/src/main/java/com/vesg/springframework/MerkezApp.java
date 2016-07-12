package com.vesg.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vesg.springframework.config.MerkezConfig;

public class MerkezApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MerkezConfig.class);
		A a = applicationContext.getBean("beanA", A.class);
		a.yaz("Selamlar");
		B b=(B)applicationContext.getBean("beanB");
		b.yaz("Java Severler");

	}

}
