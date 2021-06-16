package diego.spring.di.controllers;

import diego.spring.di.services.GreetingService;

public class PropertyInjectedController {
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
