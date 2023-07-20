package N3E1;

public class Vaixell extends Vehicle{
	private String tipus, onomatopeia;
	
	
	public Vaixell () {
		this.tipus = "vaixell";
		this.onomatopeia = "blub blub";
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

class VaixellArrencar implements Command {

	Vaixell vaixell;
	
	public VaixellArrencar(Vaixell vaixell) {
		this.vaixell = vaixell;
	}
	
	public void execute() {
		vaixell.arrencar();
	}
	
}

class VaixellAccelerar implements Command {

	Vaixell vaixell;
	
	public VaixellAccelerar(Vaixell vaixell) {
		this.vaixell = vaixell;
	}
	
	public void execute() {
		vaixell.accelerar();
	}
	
}

class VaixellFrenar implements Command {

	Vaixell vaixell;
	
	public VaixellFrenar(Vaixell vaixell) {
		this.vaixell = vaixell;
	}
	
	public void execute() {
		vaixell.frenar();
	}
	
}


