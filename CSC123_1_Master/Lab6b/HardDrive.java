
public class HardDrive {
	private double capacity;
    private double usedSpace;
    
    public HardDrive(double capacity, double usedSpace) {
    	
    }

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getUsedSpace() {
		return usedSpace;
	}

	public void setUsedSpace(double usedSpace) {
		this.usedSpace = usedSpace;
	}
	
	public double availableSpace() {
        return capacity - usedSpace;
    }
}
