package riccardogulin.u5d2.dao;

import org.springframework.stereotype.Component;

@Component
public class UsersDAO {
//	private EntityManager entityManger;
//
//	public UsersDAO(EntityManager entityManager) {
//		this.entityManger = entityManager;
//	}

	public void save() {
		System.out.println("User salvato correttamente!");
	}

	public void findById() {
		System.out.println("Ecco lo user!");
	}
}
