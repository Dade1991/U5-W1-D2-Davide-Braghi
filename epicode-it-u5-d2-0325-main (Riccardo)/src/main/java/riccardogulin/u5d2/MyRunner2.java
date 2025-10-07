package riccardogulin.u5d2;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner2 implements CommandLineRunner {
	@Autowired
	private Faker faker;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Ciao dal runner 2");
		System.out.println(faker.backToTheFuture().character());
	}
}
