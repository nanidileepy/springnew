package com.aop.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.aop")
@EnableAspectJAutoProxy

public class ApplicationContext {

	
	
}
