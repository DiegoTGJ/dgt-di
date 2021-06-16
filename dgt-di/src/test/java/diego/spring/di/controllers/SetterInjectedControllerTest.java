package diego.spring.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import diego.spring.di.services.ConstructorGreetingServiceImpl;

class SetterInjectedControllerTest {
	
	SetterInjectedController controller;
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingServiceImpl());
		
	}

	@Test
	void testGetGreetingService() {
		System.out.println(controller.getGreeting());
	}

}
