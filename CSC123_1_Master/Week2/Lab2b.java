import java.util.Scanner;
public class Lab2b {

	public static void main(String[] args) {
	
	    Scanner input = new Scanner(System.in); 
	    
	    double celsius, fahrenheit;
	    
	    System.out.print("Please enter a Celsius value: ");
	    celsius = input.nextDouble();
	    fahrenheit = celsius * 1.8 + 32;
	    System.out.printf("Converting " + celsius + " C to F: %.2f F",fahrenheit,celsius);
	    System.out.println();
	    System.out.print("Please enter a Fahrenheit value: ");
	    double fahrenheit2 = input.nextDouble();

	    double celsius2 = (( 5 * (fahrenheit2 - 32)) / 9.0);
	    System.out.printf("Converting " + fahrenheit2 + " F to C: %.2f C",celsius2);
	    
	    input.close();
	}

}
