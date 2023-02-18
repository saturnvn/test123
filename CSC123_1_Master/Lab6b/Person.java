
public class Person {
	private String ownerName;
    private int age;
    private Car car;
	
    public Person(String name, int age, Car car) {
    	
    }

	public String getName() {
		return ownerName;
	}

	public void setName(String name) {
		this.ownerName = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
