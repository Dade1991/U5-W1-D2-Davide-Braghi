package riccardogulin.u5d2;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import riccardogulin.u5d2.dao.UsersDAO;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	private Faker faker;
	@Autowired
	private UsersDAO usersDAO;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Ciao dal runner");
		System.out.println(faker.backToTheFuture().character());
		usersDAO.save();
		usersDAO.findById();
	}
}
