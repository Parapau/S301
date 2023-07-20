package N3E1;

public abstract class Vehicle {
	private String onomatopeia, tipus;
	
	public abstract String getOnomatopeia();
	
	public abstract String getTipus();
	
	public void arrencar() {
		System.out.println("El/La " + getTipus() + " esta arrencant " + getOnomatopeia());
	}
	
	public void accelerar() {
		System.out.println("El/La " + getTipus() + " esta accelerant " + getOnomatopeia());
	}
	
	public void frenar() {
		System.out.println("El/La " + getTipus() + " esta frenant " + getOnomatopeia());
	}
}
