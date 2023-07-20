package N3E1;

public class Avio extends Vehicle{
	private String tipus, onomatopeia;
	
	
	public Avio () {
		this.tipus = "avió";
		this.onomatopeia = "fiiiiuuum";
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


class AvioAccelerar implements Command {

	Avio avio;
	
	public AvioAccelerar(Avio avio) {
		this.avio = avio;
	}
	
	public void execute() {
		avio.accelerar();
	}
	
}

class AvioArrencar implements Command {

	Avio avio;
	
	public AvioArrencar(Avio avio) {
		this.avio = avio;
	}
	
	public void execute() {
		avio.arrencar();
	}
	
}

class AvioFrenar implements Command {

	Avio avio;
	
	public AvioFrenar(Avio avio) {
		this.avio = avio;
	}
	
	public void execute() {
		avio.frenar();
	}
	
}
