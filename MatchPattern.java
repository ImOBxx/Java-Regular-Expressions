
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPattern {

	public static void main(String[] args) {
	    //1st Way
	    Pattern p=Pattern.compile(".s");
	    Matcher m=p.matcher("as");
	    boolean b=m.matches();
	    
	    //2nd way
	    boolean b2=Pattern.compile("[abc]s").matcher("is").matches();
	    
	    //3rd way
	    boolean b3=Pattern.matches(".s", "as");
	    
	    
	    boolean b4=Pattern.compile("[^abc]s").matcher("ds").matches();
	    
	    System.out.println(b+", "+b2+", "+b3+", "+b4);
	    
	    
	    System.out.println(Pattern.matches(".s", "as"));
	    
	    System.out.println(Pattern.matches(".s", "mst"));
	    
	    System.out.println(Pattern.matches(".s", "amms"));
	    
	    System.out.println(Pattern.matches("..s", "mas"));
	    System.out.println(Pattern.matches("..s", "@$s"));
	    System.out.println(Pattern.matches("..s", "  s"));
	    System.out.println(Pattern.matches("..s", "\n\ns"));
	    
	    // [abc] a,b or c
	    // [^abc] any character except one of these
	    // [a-zA-Z] 
	    // [a-d[m-p]]
	    // [a-z&&[def]]  d, e or f (intersection)
	    
	    
	  


}
}
