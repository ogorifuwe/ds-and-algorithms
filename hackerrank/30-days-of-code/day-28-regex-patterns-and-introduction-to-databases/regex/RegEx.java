import java.util.*;
import java.util.regex.*;

public class RegEx {

  public static void main(String[] args) {
    /* this will match a sequence of 1 or more uppercase and lowercase English
     * letters as well as spaces */
    //String myRegExString = "[a-zA-Z\\s]+";

    /* this string will check to see if our regex matches */
    //String myString = "The quick brown fox jumped over the lazy dog...";

    /* create a Pattern object (compiled RegEx) and save it as 'p' */
    //Pattern p = Pattern.compile(myRegExString);

    /* we need a matcher to match our compiled RegEx to a string */
    //Matcher m = p.matcher(myString);

    /* if our matcher finds a match, print the match  */
    //if (m.find()) System.out.print(m.group() + '\n');

    /*String s = "Hello, Goodbye, Farewell";
    Pattern p1 = Pattern.compile("\\p{Alpha}+");
    Matcher m1 = p1.matcher(s);

    while ( m1.find() ) 
      System.out.print( m1.group() + '\n');
    */

    String s1 = "Hello, Goodbye, Farewell";
    String s2 = "Hola, Adios, Hasta Luego";

    String myDelimiter = ", ";

    String[] s1array = s1.split(myDelimiter);
    String[] s2array = s2.split(myDelimiter);

    System.out.println();
    System.out.println("s1array[0]: "+s1array[0]);
    System.out.println("s1array[1]: "+s1array[1]);
    System.out.println("s1array[2]: "+s1array[2]);
    System.out.println("s2array[0]: "+s2array[0]);
    System.out.println("s2array[1]: "+s2array[1]);
    System.out.println("s2array[2]: "+s2array[2]);
    System.out.println();
  }
}
