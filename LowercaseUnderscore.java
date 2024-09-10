
public class LowercaseUnderscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validate("java_exercises"));
		System.out.println(validate("Java_exercises"));
		System.out.println(validate("java_Exercises"));
		System.out.println(validate("Java_Exercises"));
		
		

	}
	
	public static String validate(String text) {
		if (text.matches("^[a-z]+_[a-z]+$"))
		{
			return "Found a Match!";
		}
		else 
		{
			return "Not matched!";
		}
	}


}