package com.jade.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


//@Component
//@Service
//@Repository
@Controller
public class Circle implements Shape, ApplicationEventPublisherAware {
	private Point center;
	
	private ApplicationEventPublisher applicationEventPublisher;
	
	@Autowired
	private MessageSource messageSource;
	
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	@Resource//(name="pC")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default drawing circle",null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[]{center.getX(),center.getY()}, "Default point message",null));
		//System.out.println("Message is: " + this.messageSource.getMessage("greeting", null, "Default greeting",null));
		DrawEvent drawEvent = new DrawEvent(this);
		applicationEventPublisher.publishEvent(drawEvent);
	}
	
	@PostConstruct
	public void initCircle() {
		System.out.println("initCircle");

	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("destroyCircle");

	}

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;	
	}

}
