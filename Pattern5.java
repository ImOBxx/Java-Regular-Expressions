import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(".xx.");
		Matcher matcher = pattern.matcher("MxxY");
		System.out.println("Input String matches regex - "+matcher.matches());
		// bad regular expression
		pattern = Pattern.compile("*xx*");

	}

}
