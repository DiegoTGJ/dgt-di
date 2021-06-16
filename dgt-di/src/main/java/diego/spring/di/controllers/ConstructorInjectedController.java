package diego.spring.di.controllers;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import diego.spring.di.services.GreetingService;


@Controller
public class ConstructorInjectedController {
	
	
	private final GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
