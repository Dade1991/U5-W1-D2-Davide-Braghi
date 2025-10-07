package riccardogulin.u5d2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import riccardogulin.u5d2.entities.FrontendStudent;
import riccardogulin.u5d2.entities.FullstackStudent;
import riccardogulin.u5d2.entities.Interviewer;

@SpringBootApplication
public class U5d2Application {

	public static void main(String[] args) {
		SpringApplication.run(U5d2Application.class, args);

		// ----------------------------------- METODO TRADIZIONALE (NO SPRING) ---------------------------------------
//		FrontendStudent aldo = new FrontendStudent("Aldo", "Baglio");
//		Interviewer i = new Interviewer(aldo);
//		i.askQuestion();

		// ----------------------------------- METODO CON SPRING ---------------------------------------
		// Per poter accedere agli oggetti creati tramite classe di configurazione devo accedere allo "scatolone", ovvero l'Application Context
		// Poi tramite tale riferimento potrò leggere i miei Bean, uno ad uno, tramite un comodo metodo getBean()

		// 1. Ottengo riferimento all'Application Context
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d2Application.class);

		// 2. Leggo i Bean dal context tramite .getBean(), ci sono principalmente 2 possibilità: o specifico il nome del Bean, oppure il suo tipo (classe)
		FrontendStudent fes = ctx.getBean(FrontendStudent.class); // Tramite tipo
		FrontendStudent fes2 = ctx.getBean("aldo", FrontendStudent.class); // Tramite nome bean
		System.out.println(fes);
		fes.setName("Claudio");
		System.out.println(fes);
		System.out.println(fes2);

		FullstackStudent fullstackStudent = ctx.getBean(FullstackStudent.class);
		System.out.println(fullstackStudent);

		Interviewer interviewer = ctx.getBean(Interviewer.class);
		System.out.println(interviewer);
		interviewer.askQuestion();

	}

}
