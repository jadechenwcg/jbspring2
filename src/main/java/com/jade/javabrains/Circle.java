package com.jade.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape {
	private Point center;
	
	public Point getCenter() {
		return center;
	}

	@Resource//(name="pC")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle drawn and the center is [" + center.getX() + "," + center.getY() + "]");

	}
	
	@PostConstruct
	public void initCircle() {
		System.out.println("initCircle");

	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("destroyCircle");

	}

}
