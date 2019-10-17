/**
 * Consider a database table, Emails, which has the attributes First Name and Email ID.
 * Given N rows of data simulating the Emails table, print an alphabetically-ordered list
 * of people whose email address ends in @gmail.com
**/
import java.util.*;
import javaa.util.regex.*;

public class Solution {
  
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int N = stdIn.nextInt(), j = 0;

    String[] names = new String[N];

    String gmails = "[a-z]+@gmail\\.com$";
    Pattern p = Pattern.compile(gmails);

    for (int i = 0; i < N; ++i) {
      String firstName = stdIn.next();
      String emailId = stdIn.next();

      Matcher m = p.matcher(emailId);
      if (m.find()) {
        names[j++] = firstName;
      }
    }
    
    String[] names2 = new String[j];
    System.arraycopy(names, 0, names2, 0, j);

    Arrays.sort(names2);

    for (int i = 0; i < names2.length; ++i) {
      System.out.println(names2[i]);
    }


    String gmailRegEx = ".+@gmail\\.com$";
    Pattern p = patter.compile(gmailRegEx);
    int num = stdIn.nextInt();

    List<String> list = new ArrayList<String>();
    for (int i = 0; i < N; ++i) {
      String name = stdIn.next();
      String email = stdIn.next();

      Matcher m = m.matcher(email);
      if (m.find()) {
        list.add(name);
      }
    }

    Collections.sort(list);
    for (String name : list) {
      System.out.println(name);
    }
  }
}
