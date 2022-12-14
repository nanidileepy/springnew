package com.lcm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lcm.beans.VotingEligibltyTest;

public class TestLifeBeansMethods {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("com/lcm/cfgs/applicationContext.xml");
		
		VotingEligibltyTest vv = ap.getBean("vote", VotingEligibltyTest.class);
		System.out.println(vv);
		
          ((AbstractApplicationContext) ap).close();
	}

}
