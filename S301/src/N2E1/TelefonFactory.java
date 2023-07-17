package N2E1;

public class TelefonFactory extends AbstractFactory{

	@Override
	public Apunt create(String type) {
		String[] numeros = null;
		numeros = type.split(" ");
		
		if (numeros[0].equals("+34")) {
			return new Espanya(Integer.parseInt(numeros[1]));
		} else if (numeros[0].equals("+33")) {
			return new França(Integer.parseInt(numeros[1]));
		} else if (numeros[0].equals("+39")) {
			return new Italia(Integer.parseInt(numeros[1]));
		}
		
		return null;
	}


}
