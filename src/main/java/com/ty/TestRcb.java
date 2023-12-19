package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRcb {

public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("my_conf.xml");
		RCB rcb=(RCB)context.getBean("RCB");
		rcb.win();
	}
}
