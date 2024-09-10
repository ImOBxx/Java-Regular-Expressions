import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DividedBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("^(\\d+) divided by (\\d+)$");
		Matcher matcher = pattern.matcher("10 divided by 2");
		
		if (matcher.find()) {
			String simplified = "result: " + matcher.replaceFirst("$1/$2");
			System.out.println(simplified);
		}

	}

}
