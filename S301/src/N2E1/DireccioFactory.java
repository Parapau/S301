package N2E1;

public class DireccioFactory extends AbstractFactory{

	@Override
	public Apunt create(String direccio) {
		String[] direccions = direccio.split(" ", 2);
		String[] precisio = direccio.split(", ", 3);
		if (direccions[0].equalsIgnoreCase("carrer")) {
			return new Carrer(precisio[0], precisio[1], precisio[2]);
		} else if (direccions[0].equalsIgnoreCase("plaça")) {
			return new Plaça(precisio[0], precisio[1], precisio[2]);
		} else if (direccions[0].equalsIgnoreCase("avinguda")) {
			return new Avinguda(precisio[0], precisio[1], precisio[2]);
		}
		
		return null;
	}

}
