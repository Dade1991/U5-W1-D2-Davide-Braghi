package riccardogulin.u5d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Student {

	/*
	@Setter(AccessLevel.NONE) // <-- Fammi tutti i setter tranne che sull'id
	protected long id;*/

	protected String name;
	protected String surname;

	public abstract void answerQuestion();
}
