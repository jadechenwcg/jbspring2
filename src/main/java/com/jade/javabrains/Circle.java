package com.jade.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {
	private Point center;
	
	public Point getCenter() {
		return center;
	}

//	@Required
	@Autowired //first scan type, 2nd scan name
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle drawn and the center is [" + center.getX() + "," + center.getY() + "]");

	}

}
