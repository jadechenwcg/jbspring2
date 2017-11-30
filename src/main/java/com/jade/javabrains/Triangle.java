package com.jade.javabrains;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {
//public class Triangle  {

	private Point pA;
	private Point pB;
	private Point pC;

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

	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for Triangle");
	}

	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method called for Triangle");
	}
	
	public void myInit(){
		System.out.println("my init method called for Triangle");
	}
	
	public void cleanup(){
		System.out.println("cleanup method called for Triangle");
	}

}
