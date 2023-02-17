//Sidney Mcclendon smcclendon1@toromail.csudh.edu
import java.util.Random;

public class Dice {
	private int num;
	private Random random;
	
	public Dice() {
		random = new Random();
		num = 0;
		
	}
	
	public void cast() {
		num = random.nextInt(6) + 1;
	}
	
	@Override
	public String toString() {
		return "The value is: " + num;
	}

}
