
public class OneUpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validate("Javaexercises"));
		System.out.println(validate("javaexercises"));
		System.out.println(validate("JJJJJJxercises"));
		System.out.println(validate("JavaexerciseS"));
		
		
		

	}
	
	public static String validate(String text) {
		if (text.matches("^[A-Z][a-z]+$"))
		{
			return "Found a Match!";
		}
		else 
		{
			return "Not matched!";
		}

	}

}
