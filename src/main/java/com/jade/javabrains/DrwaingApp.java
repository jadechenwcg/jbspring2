package com.jade.javabrains;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrwaingApp {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");		
		ctx.registerShutdownHook();
		Shape shape= (Shape) ctx.getBean("circle");
		shape.draw();
		
		//System.out.println(ctx.getMessage("greeting", null, "default greeting", null));

	}

}
