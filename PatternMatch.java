import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pattern pattern = Pattern.compile("[A-Za-z]\s\\d{3,4}$");
        Matcher matcher = pattern.matcher("agent 0800");
        
        boolean found = matcher.find();
        
        System.out.println("found: " + found);
	}

}











/*
 
Pattern compile(String regex)

Compiles the given regular expression into a pattern.

Pattern compile(String regex, int flags)

Compiles the given regular expression into a pattern with the given flags.

boolean matches(String regex)

Returns whether or not this string matches the given regular expression.

String[] split(CharSequence input)

Splits the given input sequence around matches of this pattern.

String quote(String s)

Returns a literal pattern String for the specified String s.

Predicate asPredicate()

Creates a predicate which can be used to match a string.


[abc]

simple, matches a or b, or c

[\^abc]

negation, matches everything except a, b, or c

[a-c]

range, matches a or b, or c

[a-c[f-h]]

union, matches a, b, c, f, g, h

[a-c&&[b-c]]

intersection, matches b or c

[a-c&&[\^b-c]]

subtraction, matches only a
.

Any character

\d

A digit: [0-9]

\D

A non-digit: [\^0-9]

\s

A whitespace character: [ \t\n\x0B\f\r]

\S

A non-whitespace character: [\^\s]

\w

A word character: [a-zA-Z_0-9]

\W

A non-word character: [\^\w]

^

The beginning of a line

$

The end of a line

\b

A word boundary

\B

A non-word boundary

\A

The beginning of the input

\G

The end of the previous match

\Z

The end of the input but for the final terminator, if any.

\z

The end of the input

*

Matches zero or more occurrences.

+

Matches one or more occurrences.

?

Matches zero or one occurrence.

(...)

Matches zero or more occurrences.

\N

Matches one or more occurrences.

(\d\d)

Matches zero or one occurrence.

(\d\d)/\1

Two digits repeated twice, \1 - refers to the matched group

Pattern.CASE_INSENSITIVE

Enables case-insensitive matching.

Pattern.COMMENTS

Whitespace and comments starting with # are ignored until the end of a line.

Pattern.MULTILINE

One expression can match multiple lines.

Pattern.DOTALL

The expression "." matches any character, including a line terminator.

Pattern.UNIX_LINES

Only the '\n' line terminator is recognized in the behavior of ., ^, and $.

 */
