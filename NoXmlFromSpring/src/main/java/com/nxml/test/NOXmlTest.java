package com.nxml.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nxml.beans.Amazon;
import com.nxml.beans.Moblies;
import com.nxml.cfgs.Config;

public class NOXmlTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ap= new AnnotationConfigApplicationContext(Config.class); 
		Amazon am=ap.getBean(Amazon.class);
		am.Delivery();
	}
	  
	
	
}
