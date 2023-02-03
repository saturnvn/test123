import java.util.Scanner;
public class Lab3b3 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int num;   
	    int guess;    

	    num = -1;

	      do
	      {
	         System.out.print("Enter a number: ");
	         guess = input.nextInt();
	         System.out.println("You entered: " + guess);

	         if (guess == num)
	         {
	            System.exit(guess);
	            break;
	         }
	         else if (guess < num)
	         {
	            System.out.print("");
	         }
	         else
	         {
	            System.out.print("");
	         }
	      }
	      while (guess != num);
	      
	      input.close();
	}
}
