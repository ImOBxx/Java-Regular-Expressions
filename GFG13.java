import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GFG13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("geeks");
		Matcher m = pattern.matcher("geeksforgeeks.org");
		
		while (m.find())
	    System.out.println("Pattern Found From " + m.start() + " to " + (m.end() - 1));
		

	}

}
