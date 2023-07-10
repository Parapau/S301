package N2E1;

public class TelefonFactory extends AbstractFactory{

	@Override
	public static Apunt create(String numero) {
		String[] numeros = null;
		numeros = numero.split(" ");
		
		if (numeros[0].equals("+34")) {
			return new Espanya(Integer.parseInt(numeros[1]));
		} else if (numeros[0].equals("+34")) {
			return new França(Integer.parseInt(numeros[1]));
		} else if (numeros[0].equals("+39")) {
			return new Italia(Integer.parseInt(numeros[1]));
		}
		
		return null;
	}

}
