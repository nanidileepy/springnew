package com.two.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Vehicle implements ApplicationContextAware
{
	/*
	 * @Autowired private Engine e;
	 */
	 private ApplicationContext ap; 
	
	/*//  Two Containers
	 * public void journey() { System.out.println("Vehicle.journey()");
	 * 
	 * ApplicationContext ap=new
	 * ClassPathXmlApplicationContext("com/two/cfgs/applicationContext.xml"); Engine
	 * e=ap.getBean(Engine.class); e.start(); e.Stop();
	 * 
	 * }
	 */
	
	/*
	 * public void journey(ApplicationContext ap) {
	 * System.out.println("Vehicle.journey()");
	 * 
	 * 
	 * Engine e=ap.getBean(Engine.class); e.start(); e.Stop();
	 * 
	 * }
	 */
	
	
	
	
	public void journey() {
		System.out.println("Vehicle.journey()");
		
		
		Engine e=ap.getBean(Engine.class);
		e.start();
		e.Stop();
		
	}
	
	public void lights() {
		System.out.println("Vehicle.lights()");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ap=applicationContext;
		
	}
	
	
}

