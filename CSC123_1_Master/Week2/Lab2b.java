import java.util.Scanner;
public class Lab2b {

	public static void main(String[] args) {
	
	    Scanner input = new Scanner(System.in); 
	    
	    double celsius, xyz;
	    
	    System.out.println("Please enter a Celsius value: ");
	    celsius = input.nextDouble();
	    xyz = celsius * 1.8 + 32;
	    System.out.printf("Converting " + celsius + " C to F: %.2f F",xyz,celsius);
	    System.out.println();
	    System.out.print("Please enter a Fahrenheit value: ");
	    double fahrenheit = input.nextDouble();

	    double celsius2 = (( 5 * (fahrenheit - 32.0)) / 9.0);
	    System.out.printf("Converting " + fahrenheit + " F to C: %.2f C",celsius2);
	    
	    input.close();
	}

}
