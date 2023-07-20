package N2E1;

public class Carrer extends DireccioFactory implements Direccio, Apunt {
	private String carrer, pis, porta;
	
	public Carrer (String carrer, String porta, String pis) {
		this.carrer = carrer;
		this.pis = pis;
		this.porta = porta;
	}

	
	public String getCarrer() {
		return carrer;
		
	}
	public String getPis() {
		return pis;
	}

	public String getPorta() {
		return porta;
	}

	public void setCarrer(String carrer) {
		this.carrer = carrer;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}


	@Override
	public String getTipus() {
		return "Carrer";
	}
	
	public String toString() {
		return getCarrer() + " " + getPorta() + " " + getPis();
	}


}


