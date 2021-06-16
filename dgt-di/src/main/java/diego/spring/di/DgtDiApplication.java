package diego.spring.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import diego.spring.di.controllers.MyController;

@SpringBootApplication
public class DgtDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DgtDiApplication.class, args);
		
		MyController myController = (MyController) ctx.getBean("myController");
		
		String greeting = myController.sayHello();
		
		System.out.println(greeting);
	}

}
