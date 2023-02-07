
public class Lab3b1 {

	public static void main(String[] args) {
		
		//1a.
		//down casting, because it converts a larger data type to a smaller data type.
		//this was me attempting part a.
		//int a = 130;
		//byte b = (byte) a;
		//System.out.println(x);
				
		//1b.
		//yes, the reason why it works is because the value is smaller, byte is -128 to 127.
		//with variables i and b
		//int i = b;
		//b = i; wont work
		//but
		//int i = b;
		//b=(byte)i; this works
		//or
		//int i = 127;
		//byte b = (byte)i;
		//System.out.println(b);
		//128 will not be correct if
		//int i = 128;
		//byte b = (byte) i;
		//System.out.println(b);
		//will ouput -128 which isnt correct
		
		//1c.
		int x = 130;
		byte y = (byte) x;
		System.out.println(y);
		
		//1d.
		//no, the value is -126. the value is what it is because it returns int. the return value of -1 also matters.
			
	}

}
