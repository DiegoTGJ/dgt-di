package diego.spring.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import diego.spring.di.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Qualifier("propertyGreetingServiceImpl")
	@Autowired
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
