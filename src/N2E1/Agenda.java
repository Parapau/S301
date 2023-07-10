package N2E1;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Apunt> agenda;

	public Agenda() {
		this.agenda = new ArrayList<Apunt>();
	}

	public List<Apunt> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Apunt> agenda) {
		this.agenda = agenda;
	}
	
	
}
