import java.util.Scanner;
public class Lab3b4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//fix all the code line it properly etc
	    System.out.println("Enter a number to check if it is truly prime number or not: ");
	    int number = input.nextInt();
	    if(isPrime(number)) {
	            System.out.println(number + " is prime number");
	        }
	        else{
	            System.out.println(number + " is a non-prime number");
	        }
	    input.close();
	    }
	    static  boolean isPrime(int num)
	    {
	        if(num<=1)
	        {
	            return false;
	        }
	       for(int i=2;i<=num/2;i++)
	       {
	           if((num%i)==0)
	               return  false;
	       }
	       return true;
	       }
}