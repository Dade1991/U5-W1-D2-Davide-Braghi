package riccardogulin.u5d2.entities;

public class FullstackStudent extends Student {

	public FullstackStudent(String name, String surname) {
		super(name, surname);
	}

	@Override
	public void answerQuestion() {
		System.out.println("Ciao sono lo studente fullstack la risposta è blablbla");
	}

	@Override
	public String toString() {
		return "FullstackStudent{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				"} ";
	}
}
