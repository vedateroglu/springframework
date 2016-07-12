package com.vesg.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vesg.springframework.B;

@Configuration
public class BConfig {

	@Bean(name="beanB")
	public B getBeanB(){
		return new B();
	}
}
