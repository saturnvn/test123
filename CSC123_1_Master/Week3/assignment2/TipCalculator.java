//Sidney Mcclendon smcclendon1@toromail.csudh.edu
package assignment2;

import java.util.Scanner;

public class TipCalculator {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			double billAmount;
			double tips = 0;
			double total;
			//7.13% decimal value
			double tax = 0.0713;
			
			double[] tipsPercentages = {5,7.5,10,15,20};
			
			System.out.print("Enter bill amount: ");
			billAmount = input.nextDouble();
			
			total = billAmount * tax + billAmount;
			
			System.out.print("How happy are you with the service [1-5] : ");
			int service = input.nextInt();
			
			if(service >= 1 && service <= 5)
			{
				tips = total * tipsPercentages[service-1]/100;
			}
			
			System.out.printf("%-40s %1s %.2f \n","Your bill total",":", billAmount);
			System.out.printf("%-40s %1s %.2f \n","Tax (@7.13%)",":", billAmount * tax);
			System.out.printf("%-40s %1s %.2f \n" , "Tip (@" + tipsPercentages[service-1] + "%) based on happiness value " + service, ":", tips);
			System.out.printf("%-40s %1s %.2f ","Total Payable",":", total + tips);
			
			input.close();
			System.exit(0);
		}
}
