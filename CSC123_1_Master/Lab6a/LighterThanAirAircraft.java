
public class LighterThanAirAircraft extends Aircraft {
	public int gasVolume;
    public String gasType;
    public int altitudeLimit;

    public LighterThanAirAircraft(String manufacturer, String model, int maxSpeed, int gasVolume, String gasType, int altitudeLimit) {
        super(manufacturer, model, maxSpeed);
        
    }

	public int getGasVolume() {
		return gasVolume;
	}

	public void setGasVolume(int gasVolume) {
		this.gasVolume = gasVolume;
	}

	public String getGasType() {
		return gasType;
	}

	public void setGasType(String gasType) {
		this.gasType = gasType;
	}

	public int getAltitudeLimit() {
		return altitudeLimit;
	}

	public void setAltitudeLimit(int altitudeLimit) {
		this.altitudeLimit = altitudeLimit;
	}
}
