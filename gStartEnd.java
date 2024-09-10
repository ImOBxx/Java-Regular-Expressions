import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gStartEnd {
    public static void main(String[] args) {
        // Sample words to test
        String[] words = {"game", "gag", "programming", "egg", "glowing", "dog"};

        // Regular expression to match words containing 'g' not at the start or end
        String regex = "\\b[a-zA-Z]*[a-fh-zA-FH-Z]g[a-fh-zA-FH-Z][a-zA-Z]*\\b";

        Pattern pattern = Pattern.compile(regex);

        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                System.out.println(word + " matches the pattern.");
            } else {
                System.out.println(word + " does not match the pattern.");
            }
        }
    }
}
