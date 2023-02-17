//Sidney Mcclendon smcclendon1@toromail.csudh.edu
import java.util.Scanner;

public class UserManager {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] firstName = new String[100];
		String[] lastName = new String[100];
		String[] email = new String[100];
		
		int i = 0;
		int total = 0;
		int choice;
		
		do {
			System.out.println("Hello, Choose an option from 1-3.");
			System.out.println();
			System.out.println("1 - Register User");
			System.out.println("2 - List Users");
			System.out.println("3 - Exit");
			System.out.println();
			System.out.print("Please enter your choice: ");
			choice = input.nextInt();
			System.out.println();
			
			if (choice == 1) {
				System.out.print("Enter first name: ");
				firstName[i] = input.next();
				System.out.print("Enter last name: ");
				lastName[i] = input.next();
				System.out.print("Enter email address: ");
				email[i] = input.next();
				System.out.println();
				System.out.println("Thank you, user " + firstName[i] + " " + lastName[i] + " (" + email[i] + ") has been registered");
				System.out.println();
				i++;
				total++;
			}
			else if (choice == 2) {
				for (int j = 0; j < total; j++) {
					int userNumber = j + 1;
					System.out.println(userNumber + "- " + lastName[j] + ", " + firstName[j] + " (" + email[j] + ")");
				}
				
				System.out.println("Total users: " + total);
				System.out.println();

			} 
			else if (choice == 3) {
				System.out.println("Thank you for using User Manager, Goodbye");
		}
			} while (choice != 3);
		
		input.close();
			
	}

}
