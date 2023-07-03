package N2E1;

public class Italia implements Telefon{
	String pais;
	int numero;
	
	public Italia(String pais, int numero) {
		this.pais = pais;
		this.numero = numero;
	}

	public String getPais() {
		return pais;
	}

	public int getNumero() {
		return numero;
	}
	
	public String getCodi() {
		return "+39";
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
}


