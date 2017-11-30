package com.jade.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{
	
	public Object postProcessAfterInitialization(java.lang.Object bean, java.lang.String beanName) throws BeansException{
		System.out.println("BeanPostProcessor postProcessAfterInitialization method called, beanName is " + beanName);
		return bean;
	}
	

	public Object postProcessBeforeInitialization(java.lang.Object bean, java.lang.String beanName) throws BeansException{
		System.out.println("BeanPostProcessor postProcessBeforeInitialization method called, beanName is " + beanName);
		return bean;
	}
}
