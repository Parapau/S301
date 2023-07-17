package N3E1;

public class Main {//es arrAncar no arrEncar pero lo he puesto en todos y no voy a cambiarlo ahora

	public static void main (String args[]) {
		
		Control control = new Control();
		Cotxe cotxe = new Cotxe();
		Vaixell vaixell = new Vaixell();
		Bicicleta bici = new Bicicleta();
		Avio avio = new Avio();
		
		
		control.setComand(new CotxeAccelerar(cotxe));
		
		control.comandar();
		
		control.setComand(new VaixellArrencar(vaixell));
		
		control.comandar();
	
		control.setComand(new BiciArrencar(bici));
		
		control.comandar();
		
		control.setComand(new AvioFrenar(avio));
		
		control.comandar();
	
	
	}
	
	
}
