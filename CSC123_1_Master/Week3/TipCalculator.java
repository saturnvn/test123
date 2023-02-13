//Sidney Mcclendon smcclendon1@toromail.csudh.edu


import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			DecimalFormat df = new DecimalFormat(".00");
			
			int happiness;
			double bill;
			double tips = 0;
			double total;
			double tax = 0.0713;
			
			double[] tips_percentages = {5,0.075,10,15,20};
			
			System.out.print("Enter bill amount: ");
			bill = input.nextDouble();
			
			total = bill * tax + bill;
			
			System.out.print("How happy are you with the service [1-5] : ");
			happiness = input.nextInt();
			
			if(happiness >= 1 && happiness <= 5)
			{
				tips = total * tips_percentages[happiness - 1]/100;
			}
			
			df.setRoundingMode(RoundingMode.DOWN);
			System.out.printf("%-40s %1s \n","Your bill total",": " + bill);
			System.out.printf("%-40s %1s \n","Tax (@7.13%)",": " + df.format(bill * tax));
			System.out.printf("%-40s %1s %.2f \n" , "Tip (@" + tips_percentages[happiness - 1] + "%) based on happiness value " + happiness, ":", tips);
			System.out.printf("%-40s %1s ","Total Payable",": " + df.format(total + tips));
			
			input.close();
			System.exit(0);
		}
}
