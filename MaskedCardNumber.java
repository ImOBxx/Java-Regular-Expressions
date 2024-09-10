import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaskedCardNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cardNumber = "1234-2222-3333-4343";
		
		Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
		Matcher matcher = pattern.matcher(cardNumber);
		
		String maskedCardNumber = matcher.replaceAll("XXXX-XXXX-XXXX-");
		System.out.println(maskedCardNumber);

	}

}
