
public class FixedWingAircraft extends HeavierThanAirAircraft {
	public int enginePower;
    public int fuelCapacity;
    public String fuelType;

    public FixedWingAircraft(String manufacturer, String model, int maxSpeed, int weight, int wingspan, int enginePower, int fuelCapacity, String fuelType) {
        super(manufacturer, model, maxSpeed, weight, wingspan);
        
    }

	public int getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
}
