package com.lcm.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("vote")
public class VotingEligibltyTest {

	private String name;
	private int age;

	public VotingEligibltyTest() {
		System.out.println("VotingEligibltyTest.VotingEligibltyTest()");
	}

	@PostConstruct
	public void initmethod() {
		name = "Dileep";
		age = 12;
		System.out.println("VotingEligibltyTest.initmethod()");
	}

	@Override
	public String toString() {
		return "VotingEligibltyTest [name=" + name + ", age=" + age + "]";
	}

	@PreDestroy
	public void destroyMethod() {
		System.out.println("VotingEligibltyTest.destroyMethod()");
	}

}
