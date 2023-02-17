//Sidney Mcclendon smcclendon1@toromail.csudh.edu
public class Circle {
	private String s;
	private double radius;
	
	public Circle(String s, double radius) {
		this.s = s;
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return s + "\nRadius       : " + radius + "\nArea         : " + String.format("%.2f", getArea()) + "\nCircumference: " + String.format("%.2f", getCircumference());
		
	}
	
}