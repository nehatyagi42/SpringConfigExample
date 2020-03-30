package com.rtpl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rtpl.hello.HelloWorld;
import com.rtpl.hello.impl.HelloWorldImpl;

@Configuration
public class AppConfig {
	 @Bean(name="helloBean")
	    public HelloWorld helloWorld() {
	        return new HelloWorldImpl();
	    }
}
