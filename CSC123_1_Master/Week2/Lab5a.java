
import java.util.Scanner;

public class Lab5a {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//the next() method returns the next complete token as a String
		System.out.print("Please enter a word: ");
		String word = input.next();
		System.out.println("You entered: " + word);
		
		//the nextLine() method reads the next line as a String
		System.out.print("Please enter a line: ");
		String line = input.nextLine();
		System.out.println("You entered: " + line);
		
		//the nextInt() method scans the next token as an int
		System.out.print("Please enter a number: ");
		int num = input.nextInt();
		System.out.println("You entered: " + num);
		
		//the hasNext() method will return true if there is another token in its input
		System.out.println("Has another token in its input: " + input.hasNext());
		
		//the close() method closes the Scanner
		input.close();

	}

}
