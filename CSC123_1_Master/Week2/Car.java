
public class Car {
	//can't make make public because it can't be changed
	//can make color public because it can be changed
	//private String color;
	//private int year;
	//private int doors;
	private boolean engineState;
	private String make;
	private char gear; //'D','N','R','P'
	//private boolean ignitionState; // On / Off
	//private boolean headLampState;
	//by default java will put boolean false etc
	public Car() {
		
	}
//source > generate constructor using fields
	public Car(String color, int year, int doors, String make) {
		super();
		//this.color = color;
		//this.year = year;
		//this.doors = doors;
		this.make = make;
		this.gear = 'N';
	}
	public boolean start() {
		if(gear == 'P') {
			engineState = true;
		}
		return engineState;
	}
	public void changeGear() {
	}
	
	public String toString() {
		String s = "Make = "+make+"\n"+"Started = "+engineState;
		return s;
		
	}
}
