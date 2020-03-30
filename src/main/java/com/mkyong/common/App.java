package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rtpl.config.AppConfig;
import com.rtpl.hello.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
	    
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
    
    obj.printHelloWorld("Java Configuration is Printed");

}
}
