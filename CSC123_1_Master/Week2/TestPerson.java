import java.text.ParseException;

public class TestPerson {
	public static void main(String[] args) throws ParseException
	{
		Person person = new Person("Sidney", "Mcclendon", "01/13/03");
		System.out.println("Full Name: " + person.getFullName());
		System.out.println("Age: " + person.getAge());
	}
}