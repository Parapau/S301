package N2E1;

public class França extends TelefonFactory implements Telefon, Apunt {
	int numero;
	
	public França(int numero) {
		this.numero = numero;
	}


	public int getNumero() {
		return numero;
	}
	
	public String getCodi() {
		return "+33";
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
