import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class ValidatePhone {
 
    public static void main(String[] args)
    {
        String phone = "123-456-7890";
        String regex = "^\\d{3}-\\d{3}-\\d{4}$";
 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
 
        boolean isPhoneValid = matcher.matches();
 
        if (isPhoneValid) {
            System.out.println("Phone number is valid");
        }
        else {
            System.out.println("Phone number is invalid");
        }
    }
}