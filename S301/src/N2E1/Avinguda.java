package N2E1;

public class Avinguda extends DireccioFactory implements Direccio, Apunt{
	String carrer, pis, porta;

	public Avinguda (String carrer, String porta, String pis) {
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
		return "Avinguda";
	}

	public String toString() {
		return getCarrer() + " " + getPorta() + " " + getPis();
	}

}

