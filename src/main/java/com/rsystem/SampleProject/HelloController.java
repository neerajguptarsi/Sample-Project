package com.rsystem.SampleProject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String WelcomeMessage() {
		return "Hello World";
	}
	@RequestMapping(method=RequestMethod.GET, path="/hello-world-bean")
	public HelloWorldBean WelcomeMessageBean() {
		return new HelloWorldBean("Hello World");
	}

	@RequestMapping(method=RequestMethod.GET, path="/hello-world-bean/pathvaraible/{name}")
	public HelloWorldBean WelcomeMessagePath(@PathVariable String name) {
		return new HelloWorldBean("Hello World "+name);
	}
}
