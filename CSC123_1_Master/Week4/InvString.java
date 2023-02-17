//Sidney Mcclendon smcclendon1@toromail.csudh.edu
public class InvString {
	private String str;
	
	public InvString(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return new StringBuilder(str).reverse().toString();
	}
}