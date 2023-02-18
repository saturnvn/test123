
public class HybridVerticalTakeoffAircraft extends RotaryAircraft {
	public int thrustPower;
    public int numWings;
    public String controlSystem;

    public HybridVerticalTakeoffAircraft(String manufacturer, String model, int maxSpeed, int weight, int wingspan, int rotorDiameter, int numBlades, int numEngines, int thrustPower, int numWings, String controlSystem) {
        super(manufacturer, model, maxSpeed, weight, wingspan, rotorDiameter, numBlades, numEngines);
        
    }

	public int getThrustPower() {
		return thrustPower;
	}

	public void setThrustPower(int thrustPower) {
		this.thrustPower = thrustPower;
	}

	public int getNumWings() {
		return numWings;
	}

	public void setNumWings(int numWings) {
		this.numWings = numWings;
	}

	public String getControlSystem() {
		return controlSystem;
	}

	public void setControlSystem(String controlSystem) {
		this.controlSystem = controlSystem;
	}
}
