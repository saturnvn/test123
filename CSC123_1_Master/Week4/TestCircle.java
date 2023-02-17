import java.text.ParseException;

public class TestCircle {
	public static void main(String[] args) throws ParseException {
		Circle c = new Circle("My Circle" , 20);
		System.out.printf("%.2f", c);
		System.out.println(c);
	}

}
