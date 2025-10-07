package riccardogulin.u5d2.entities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Interviewer {
	// @Autowired
	private Student student;

	public Interviewer(@Qualifier("getFSStudent") Student student) {
		this.student = student;
	}


	public void askQuestion() {
		System.out.println("Ciao " + this.student.getName() + ", per favore rispondi alla seguente domanda..blablabla");
		this.student.answerQuestion();
	}

	@Override
	public String toString() {
		return "Interviewer{" +
				"student=" + student +
				'}';
	}
}
