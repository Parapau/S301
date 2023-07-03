package N2E1;

import java.util.ArrayList;
import java.util.List;

public class Agenda<T> {
	private List<T> agenda;

	public Agenda() {
		this.agenda = new ArrayList<T>();
	}

	public List<T> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<T> agenda) {
		this.agenda = agenda;
	}
	
	
}
