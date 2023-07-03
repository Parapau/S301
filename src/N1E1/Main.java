package N1E1;

import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner (System.in);

	public static void main (String args[]) {
		Undo undo = Undo.getInstancia();
		int opcio = 0;

		System.out.println("Dona comandes i fare coses, per eliminar al ultima comanda que has entrat introdueix undo\n"
				+ "1.escriure basura a la pantalla\n"
				+ "2.escriure coses boniques a la pantalla\n"
				+ "3.veure les comandes anteriors\n"
				+ "0.sortir");
		do {
			opcio = numeros();
			switch (opcio) {
			case 1:
				asdfg();
				break;
			case 2:
				patata();
				break;
			case 3:
				Undo.getInstancia().showComandes();
				break;
			case 6:
				System.out.println("Comanda eliminada");
				break;
			default:
				System.out.println("si veus aixo el programador es gilipolles");
				break;
			}

		} while (true);


	}
	public static void asdfg() {
		int i = 0;
		System.out.println("a");
		while (i < 80) {
			System.out.println("aiosuhdaiwhdgasugfgvjkxzhcgvjsdgfjsahedypoAUWDshfvioxudhfygvbopaerkljbasdjfvygxdfopciubjñalsehnflkjasgfoidufgbòcjvbmdbxfkjgsapefSOHFwseçççççawjdghawi");
			i = (int) (Math.random() * 100);
		}

	}

	public static void patata() {
		System.out.println("Les patates estan molt bones");

	}

	public static int numeros (){
		int opcio = 0;
		String num;
		boolean numeros;
		do {
			try {
				num = Undo.getInstancia().input();
				if (num.equalsIgnoreCase("undo")) {
					Undo.getInstancia().removeComanda();
					numeros = true;
					opcio = 6;
				} else {
					opcio = Integer.parseInt(num);
					numeros = true;
				}
			}
			catch (java.lang.NumberFormatException e) {
				System.err.println("Aixo no es un numero.");
				numeros = false;
			}
		} while (!numeros);
		return opcio;


	}
}