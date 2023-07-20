package N3E1;

public class Cotxe extends Vehicle{
	private String tipus, onomatopeia;
	
	
	public Cotxe () {
		this.tipus = "cotxe";
		this.onomatopeia = "brum brum";
	}
	
	
	public String getTipus() {
		return tipus;
	}


	public String getOnomatopeia() {
		return onomatopeia;
	}


	public void setTipus(String tipus) {
		this.tipus = tipus;
	}


	public void setOnomatopeia(String onomatopeia) {
		this.onomatopeia = onomatopeia;
	}
	
}

class CotxeArrencar implements Command {

	Cotxe cotxe;
	
	public CotxeArrencar(Cotxe cotxe) {
		this.cotxe = cotxe;
	}
	
	public void execute() {
		cotxe.arrencar();
	}
	
}

class CotxeAccelerar implements Command {

	Cotxe cotxe;
	
	public CotxeAccelerar (Cotxe cotxe) {
		this.cotxe = cotxe;
	}
	
	public void execute() {
		cotxe.accelerar();
	}
	
}

class CotxeFrenar implements Command {

	Cotxe cotxe;
	
	public CotxeFrenar (Cotxe cotxe) {
		this.cotxe = cotxe;
	}
	
	public void execute() {
		cotxe.frenar();
	}
	
}






