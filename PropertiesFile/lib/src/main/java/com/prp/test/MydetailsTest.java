package com.prp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prp.beans.Mydetails;
import com.prp.beans.PrototypeChecking;

public class MydetailsTest {
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/prp/cfg/applicationContext.xml");

		Mydetails m=ac.getBean("mydet",Mydetails.class);
		System.out.println(m);
		PrototypeChecking pt=ac.getBean(PrototypeChecking.class);
		PrototypeChecking pt1=ac.getBean(PrototypeChecking.class);
		PrototypeChecking pt2=ac.getBean(PrototypeChecking.class);
		
		
	}
}
