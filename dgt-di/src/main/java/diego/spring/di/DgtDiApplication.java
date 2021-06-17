package diego.spring.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import diego.spring.di.controllers.ConstructorInjectedController;
import diego.spring.di.controllers.MyController;
import diego.spring.di.controllers.PropertyInjectedController;
import diego.spring.di.controllers.SetterInjectedController;

@SpringBootApplication
public class DgtDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DgtDiApplication.class, args);
		
		MyController myController = (MyController) ctx.getBean("myController");

		
		System.out.println("------------PRIMARY BEAN");
		System.out.println(myController.sayHello());
		
		System.out.println("------------Property");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("------------Setter");
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		
		System.out.println("------------Constructor");
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		
		System.out.println(constructorInjectedController.getGreeting());

	}

}
