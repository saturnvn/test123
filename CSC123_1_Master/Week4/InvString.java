//Sidney Mcclendon smcclendon1@toromail.csudh.edu
public class InvString {

	public static void main(String[] args) {
		
		String string = "This is a test";
		
		char[] array = string.toCharArray();
		
		for(int i = array.length - 1; i >= 0; i--)
		{
			System.out.print(array[i]);
		}	

	}
	
}
