package N2E1;

public class Main {

	public static void main (String args[]) {
		Agenda agenda = new Agenda();
		
		AbstractFactory telFactory = new TelefonFactory();
		AbstractFactory dirFactory = new DireccioFactory();
		
		
		agenda.getAgenda().add(telFactory.create("+34 620109676"));
		agenda.getAgenda().add(telFactory.create("+33 765461896"));
		agenda.getAgenda().add(telFactory.create("+39 654654218"));
		agenda.getAgenda().add(telFactory.create("+34 618770411"));
	
		agenda.getAgenda().add(dirFactory.create("Carrer Roc Boronat, n127, 2n 4a"));
		agenda.getAgenda().add(dirFactory.create("Plaça Sant Jaume, n1, 1r 1a"));
		agenda.getAgenda().add(dirFactory.create("Avinguda Paral·lel, n82, 3r 6a"));
		
		
		for (Apunt i : agenda.getAgenda()) {
			System.out.println(i.toString());
			
		}
	}
}
