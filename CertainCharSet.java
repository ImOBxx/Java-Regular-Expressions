
public class CertainCharSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validate("ABCDEFabcdef123450"));
		System.out.println(validate("SQL"));
		System.out.println(validate("Java"));
		System.out.println(validate("*&%@#!"));
		System.out.println(validate("w3resource.com"));

	}
	
	public static boolean validate(String text) {
		return text.matches("^[\\w]+$");
	}
	

}
