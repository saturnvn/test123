import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		int num = input.nextInt();
		System.out.println("Here is a " + num + " x " + num + " multiplication table:");
		
		int i=1;
		while(i<=num){ 
		int j=1; 
		    while(j<=num)
		    {
		     System.out.print(i*j+"\t");
		     j++;
		    }
		            i++;
		            System.out.println();
		}
					input.close();
	}
}
