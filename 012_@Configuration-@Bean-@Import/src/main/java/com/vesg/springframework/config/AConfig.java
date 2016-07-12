package com.vesg.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vesg.springframework.A;

@Configuration
public class AConfig {

	@Bean(name="beanA")
	public A getBeanA(){
		return new A();
	}
}
