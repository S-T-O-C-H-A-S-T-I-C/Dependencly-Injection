package com.somanshu.dependencyinjection.depinject;

import com.somanshu.dependencyinjection.depinject.controller.Controller1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DepInjectApplication {

	public static void main(final String[] args) {

		final ApplicationContext applicationContext =  SpringApplication.run(DepInjectApplication.class, args);
		final Controller1 controller1 = (Controller1)applicationContext.getBean("controller1");
		System.out.println(controller1.sayHello());
	}

}


