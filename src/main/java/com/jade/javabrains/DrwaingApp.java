package com.jade.javabrains;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrwaingApp {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");		
		ctx.registerShutdownHook();
		Triangle t = (Triangle) ctx.getBean("triangle");
		t.draw();

	}

}
