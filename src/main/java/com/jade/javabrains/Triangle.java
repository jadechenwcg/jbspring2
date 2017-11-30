package com.jade.javabrains;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

	private Point pA;
	private Point pB;
	private Point pC;
	private ApplicationContext context = null;

	public Point getpA() {
		return pA;
	}

	public void setpA(Point pA) {
		this.pA = pA;
	}

	public Point getpB() {
		return pB;
	}

	public void setpB(Point pB) {
		this.pB = pB;
	}

	public Point getpC() {
		return pC;
	}

	public void setpC(Point pC) {
		this.pC = pC;
	}

	public void draw() {
		System.out.println("Traingle drawn [" + getpA().getX() + ","
				+ getpA().getY() + "]" + "[" + getpB().getX() + ","
				+ getpB().getY() + "]" + "[" + getpC().getX() + ","
				+ getpC().getY() + "]");
	}

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;	
		System.out.println("context is : " + context);
	}

	public void setBeanName(String beanName) {
		System.out.println("beanNmae is : " + beanName);
		
	}

}
