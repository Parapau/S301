package N2E1;

public class Espanya extends TelefonFactory implements Telefon, Apunt {
	private int numero;
	
	public Espanya(int numero) {
		this.numero = numero;
	}


	public int getNumero() {
		return numero;
	}
	
	public String getTipus() {
		return "+34";
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return getTipus() + " " + getNumero();
	}
}

