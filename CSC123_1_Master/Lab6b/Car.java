
public class Car {
	private String make;
    private String model;
    private Engine engine;
    private boolean navigation;
    private boolean transmission;
    private boolean electric;
    
    public Car(String make, String model, Engine engine, boolean navigation) {
    	
    }

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public boolean isNavigation() {
		return navigation;
	}

	public void setNavigation(boolean navigation) {
		this.navigation = navigation;
	}

	public boolean isTransmission() {
		return transmission;
	}

	public void setTransmission(boolean transmission) {
		this.transmission = transmission;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}
}
