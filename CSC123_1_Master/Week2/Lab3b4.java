import java.util.Scanner;
public class Lab3b4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

	    System.out.println("Input an integer to see if it is a prime number: ");
	    int num = input.nextInt();
	    
	    if(isPrime(num))
	    {
	    	System.out.println(num + " true, it is a prime number");
	    }
	    else
	    {
	    	System.out.println(num + " false, not a prime number");
	    }
	    input.close();
	    }
	    static  boolean isPrime(int num)
	    {
	        if(num <= 1)
	        {
	            return false;
	        }
	       for(int i = 2; i <= num / 2; i++)
	       {
	           if((num % i ) == 0 )
	               return  false;
	       }
	       return true;
	       }
}