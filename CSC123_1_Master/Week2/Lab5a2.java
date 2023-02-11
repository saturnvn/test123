
public class Lab5a2 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		//the length() method will return the length of the string
		System.out.println("Length of str: " + str.length());
		
		//the charAt() method returns the character at the specified index
		System.out.println("Character at index 5: " + str.charAt(5));
		
		//the substring() method returns part of the string
		System.out.println("Substring from index 5: " + str.substring(5));
		
		//the replace() method replaces specified character and returns a new string
		System.out.println("Replace Hello with 'Goodbye': " + str.replace("Hello", "Goodbye"));
		
		//the toLowerCase() method converts a string to lowercase
		System.out.println("Lowercase: " + str.toLowerCase());

	}

}
