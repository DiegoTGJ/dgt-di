package diego.spring.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import diego.spring.di.services.ConstructorGreetingServiceImpl;

class PropertyInjectedControllerTest {
	PropertyInjectedController controller;
	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();
		
		controller.greetingService = new ConstructorGreetingServiceImpl();
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
