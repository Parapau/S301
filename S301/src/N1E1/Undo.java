package N1E1;

import java.util.ArrayList;
import java.util.Scanner;

public class Undo {
	private static Scanner entrada = new Scanner (System.in);
	private static Undo instancia = new Undo();
	private ArrayList<String> comandes;

	
	
	public Undo() {
		this.comandes = new ArrayList<String>();
		
	}



	public static Undo getInstancia() {
		if (instancia == null) {
			instancia = new Undo();
		}
		
		return instancia;
	}



	public ArrayList<String> getComandes() {
		return comandes;
	}



	public void setComandes(ArrayList<String> comandes) {
		this.comandes = comandes;
	}
	
	
	
	public String input () {
		String input;
		input = entrada.nextLine();
		addComanda(input);
		
		
		return input;
	}
	
	public void addComanda(String comanda) {
		this.comandes.add(comanda);
	}
	
	
	public void removeComanda() {
		this.comandes.remove(comandes.size()-1);
		try {
			this.comandes.remove(comandes.size()-1);
			System.out.println("Comanda eliminada");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("No hi ha cap comanda aixi que no hi ha res a eliminar");
		}
		
	}
	
	
	public void showComandes() {
		System.out.println("Aquestes son les comandes que has executat:");
		for (String i : comandes) {
			System.out.println(i);
		}
	}
}
