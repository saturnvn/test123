import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person {
	private String firstName;
	private String lastName;
	private Date dob;
	
	public Person(String firstName, String lastName, String dob) throws ParseException
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		SimpleDateFormat formatter = new SimpleDateFormat("mm/dd/yy");
		this.dob = formatter.parse(dob);

	}
	
	public String getFullName()
	{
		return firstName + " " + lastName;
	}
	
	public int getAge()
	{
		Calendar now = Calendar.getInstance();
		Calendar dob = Calendar.getInstance();
		dob.setTime(this.dob);
		int age = now.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
		if (now.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR))
		{
			age--;
		}
		return age;
	}

}
