package N2E1;

public class França extends TelefonFactory implements Telefon, Apunt {
	private int numero;
	
	public França(int numero) {
		this.numero = numero;
	}


	public int getNumero() {
		return numero;
	}
	
	public String getTipus() {
		return "+33";
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return getTipus() + " " + getNumero();
	}
	
}
