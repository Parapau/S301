package N3E1;

public class Bicicleta extends Vehicle{
	String tipus, onomatopeia;
	
	
	public Bicicleta () {
		this.tipus = "bicileta";
		this.onomatopeia = "ring ring";
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


class BiciAccelerar implements Command {

	Bicicleta bici;
	
	public BiciAccelerar(Bicicleta bici) {
		this.bici = bici;
	}
	
	public void execute() {
		bici.accelerar();
	}
	
}

class BiciArrencar implements Command {

	Bicicleta bici;
	
	public BiciArrencar(Bicicleta bici) {
		this.bici = bici;
	}
	
	public void execute() {
		bici.arrencar();
	}
	
}

class BiciFrenar implements Command {

	Bicicleta bici;
	
	public BiciFrenar(Bicicleta bici) {
		this.bici = bici;
	}
	
	public void execute() {
		bici.frenar();
	}
	
}