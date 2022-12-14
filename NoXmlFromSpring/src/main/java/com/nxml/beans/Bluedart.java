package com.nxml.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bluedart implements Courier {
	@Value("${name}")
	private String name;
	@Value("${age}")
	private String age;
	@Value("${sex}")
	private String sex;
	@Value("${job}")
	private String job;
	
	@Override
	public String toString() {
		return "Bluedart [name=" + name + ", age=" + age + ", sex=" + sex + ", job=" + job + "]";
	}
	@Override
	public String Company() {

		return "Bluedart";
		
	}

}
