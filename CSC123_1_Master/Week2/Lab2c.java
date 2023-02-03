import java.util.Scanner;
public class Lab2c {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 5; ++i)
	    {
			System.out.print("Provide a Char value to convert it to its ASCII value: "); 
			char char2 = input.next().charAt(0);
			int ascii2 = char2;  
			System.out.println("ASCII value of " + char2 + " is: "+ ascii2); 
	    }
			input.close();
	}

}
