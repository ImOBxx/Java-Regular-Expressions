import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validate("The quick brown fox jumped over the lazy dog"));
		System.out.println(validate("Java Exercises"));
		System.out.println(validate("Do Humnas Eat Gizzrads?"));
		System.out.println(validate("Gizzards?"));
		
		
		
		

	}
	
	public static String validate(String text) {
		Pattern pattern = Pattern.compile("\\w*g.\\w*");
		Matcher m = pattern.matcher(text);
		
		if (m.find())
		{
			return "Found a Match!";
		}
		else 
		{
			return "Not matched!";
		}

	}

}
