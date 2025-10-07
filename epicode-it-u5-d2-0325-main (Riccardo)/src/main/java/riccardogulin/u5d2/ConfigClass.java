package riccardogulin.u5d2;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import riccardogulin.u5d2.entities.BackendStudent;
import riccardogulin.u5d2.entities.FrontendStudent;
import riccardogulin.u5d2.entities.FullstackStudent;

import java.util.Locale;

@Configuration // Annotazione è OBBLIGATORIA se vogliamo che questa venga presa in considerazione all'avvio dell'applicazione
@PropertySource("application.properties") // Annotazione fondamentale se vogliamo leggere i valori da
// application.properties
public class ConfigClass {
	/*
	Questa classe conterrà un elenco di tutti gli oggetti di cui avrò bisogno all'avvio dell'applicazione (BEANS)
	Quindi all'interno di questa classe dovrò scrivere una serie di "istruzioni" su come voglio che essi vengano creati
	Ogni Bean sarà pertanto un oggetto gestito non da noi ma da Spring
	Per creare un Bean basterà aggiungere un metodo a questa classe annotandolo con @Bean
	*/

	@Bean
	public int getNumber() {
		return 42;
	}

	@Bean

	public String getAdminName() {
		return "Ajeje";
	}

	@Bean
	// Siccome nel main non posso utilizzare le annotazioni come @Value, un "trucco" per accedere alle variabili definite
	// in application.properties dal main è definire un Bean che ritorni tale valore
	@Primary
	public String getPGUsername(@Value("${pg.username}") String pgUsername) {
		return pgUsername;
	}

	@Bean(name = "aldo") // Opzionalmente quando dichiaro un bean posso specificare un nome custom
	// altrimenti verrà utilizzato il nome del metodo
	@Scope("prototype") // Annotazione OPZIONALE. Mi serve quando non voglio che lo Scope sia SINGLETON (default)
	// SINGLETON = c'è un'unica copia di quell'oggetto in TUTTA L'APP. Questo è il comportamento di default dei Beans ed è estremamente utile
	// PROTOTYPE = ogni volta che qualcuno usa .getBean(), verrà creato un NUOVO OGGETTO scollegato dal precedente
	// Esistono altri valori per lo scope, ma hanno senso solo in un contesto Web
	public FrontendStudent getFEStudent(@Qualifier("getAdminName") String name, @Qualifier("getPGUsername") String surname) {
		return new FrontendStudent(name, surname);
	}

	@Bean
	// @Primary // Annotazione OPZIONALE per risolvere le ambiguità. Ogni qualvolta c'è un dubbio su chi scegliere,
	// questo verrà scelto come DEFAULT
	public BackendStudent getBEStudent() {
		return new BackendStudent("Giovanni", "Storti");
	}

	@Bean
	public FullstackStudent getFSStudent(@Value("${admin.name}") String name) {
		return new FullstackStudent(name, "Poretti");
	}

//	@Bean
//	public Interviewer getInterviewer(@Qualifier("aldo") Student student) {
//		// Si dice che il parametro Student è una DIPENDENZA di Interviewer
//		// Spring cercherà di soddisfare questa dipendenza andando a cercare nello scatolone
//		// se trova un Bean compatibile (se ne trova zero, avremo un problema all'avvio dell'applicazione,
//		// anche se ne troviamo più di uno compatibile avremo un problema simile)
//		return new Interviewer(student);
//	}

	@Bean
	// Siccome il Faker è una libreria di terze parti, non posso creare un Bean tramite @Component
	// allora se voglio renderla un Bean per poterla utilizzare globalmente nell'applicazione senza dovermela creare manualmente ogni volta
	// posso creare un Bean qua nella classe di configurazione
	public Faker getFaker() {
		return new Faker(Locale.ITALY);
	}
}
