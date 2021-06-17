package diego.spring.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - PRIMARY BEAN";
	}

}
