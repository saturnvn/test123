
public class TestCar {
	public static void main(String[] args) {
		Car myToyota = new Car("Black",2023,4,"Toyota");
		myToyota.changeGear();
		//myToyota.engineState = true
		myToyota.start();
				//the car is in neutral it cannot start because gear = N
				System.out.println(myToyota);
		//will output a hash value bytes based on values added, unique object
		//can be fixed
	}
}
