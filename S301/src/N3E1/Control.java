package N3E1;

public class Control {
	
	Command slot;
	
	public Control() {}
	
	public void setComand(Command command) {
		this.slot = command;
	}
	
	public void comandar() {
		this.slot.execute();
	}
	
}
