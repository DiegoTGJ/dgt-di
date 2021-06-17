package diego.spring.di.controllers;

import org.springframework.stereotype.Controller;

import diego.spring.di.services.GreetingService;

@Controller
public class MyController {
	
	private final GreetingService greetingService;
	
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}


	public String sayHello() {
		
		return greetingService.sayGreeting();
	}
}
