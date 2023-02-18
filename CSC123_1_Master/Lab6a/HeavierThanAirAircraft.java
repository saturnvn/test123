
public class HeavierThanAirAircraft extends Aircraft {
	public int weight;
    public int wingspan;

    public HeavierThanAirAircraft(String manufacturer, String model, int maxSpeed, int weight, int wingspan) {
        super(manufacturer, model, maxSpeed);
        
    }
    //source > getters and setters
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}
}
	