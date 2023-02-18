
public class RotaryAircraft extends HeavierThanAirAircraft {
	public int rotorDiameter;
    public int numBlades;
    public int numEngines;

    public RotaryAircraft(String manufacturer, String model, int maxSpeed, int weight, int wingspan, int rotorDiameter, int numBlades, int numEngines) {
        super(manufacturer, model, maxSpeed, weight, wingspan);
        
    }

	public int getRotorDiameter() {
		return rotorDiameter;
	}

	public void setRotorDiameter(int rotorDiameter) {
		this.rotorDiameter = rotorDiameter;
	}

	public int getNumBlades() {
		return numBlades;
	}

	public void setNumBlades(int numBlades) {
		this.numBlades = numBlades;
	}

	public int getNumEngines() {
		return numEngines;
	}

	public void setNumEngines(int numEngines) {
		this.numEngines = numEngines;
	}
}
