//Sidney Mcclendon smcclendon1@toromail.csudh.edu
package assignment2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			DecimalFormat df = new DecimalFormat(".00");
			
			int happiness;
			double billAmount;
			double tips = 0;
			double total;
			double tax = 0.0713;
			
			double[] tipsPercentages = {5,0.075,10,15,20};
			
			System.out.print("Enter bill amount: ");
			billAmount = input.nextDouble();
			
			total = billAmount * tax + billAmount;
			
			System.out.print("How happy are you with the service [1-5] : ");
			happiness = input.nextInt();
			
			if(happiness >= 1 && happiness <= 5)
			{
				tips = total * tipsPercentages[happiness - 1]/100;
			}
			
			df.setRoundingMode(RoundingMode.DOWN);
			System.out.printf("%-40s %1s \n","Your bill total",": " + billAmount);
			System.out.printf("%-40s %1s \n","Tax (@7.13%)",": " + df.format(billAmount * tax));
			System.out.printf("%-40s %1s %.2f \n" , "Tip (@" + tipsPercentages[happiness - 1] + "%) based on happiness value " + happiness, ":", tips);
			System.out.printf("%-40s %1s ","Total Payable",": " + df.format(total + tips));
			
			input.close();
			System.exit(0);
		}
}
