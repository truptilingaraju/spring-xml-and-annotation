package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProduct {

public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("my_conf.xml");
		Product product=(Product)context.getBean("myProduct");
		product.quality();
	}
}
