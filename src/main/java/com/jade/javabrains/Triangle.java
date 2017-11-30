package com.jade.javabrains;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle  {

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


}
