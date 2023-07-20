package N2E1;

public class Italia extends TelefonFactory implements Telefon, Apunt{
	private int numero;
	
	public Italia(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	public String getTipus() {
		return "+39";
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public String toString() {
		return getTipus() + " " + getNumero();
	}
	
}


