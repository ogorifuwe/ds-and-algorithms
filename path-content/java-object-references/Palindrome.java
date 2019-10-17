/* Tests user input to determin whether or not it is a palindrome*/
import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    String str, another = "y";
    int left, right, count = 0, remainder = 0;

    while (another.equalsIgnoreCase("y")) {
      
      System.out.println("Enter a string to test if it is a plaindrome"
          + " and press enter: ");

      str = (String) in.nextLine();
      left = 0;
      right = str.length()-1;

      while (str.charAt(left) == str.charAt(right) && left < right) {
        left++;
        right--;
        count++;

        if (left < right) {
          System.out.println("That is not a palindrome");
          System.out.println("However, there were " + count + " letters on bs");
          remainder = (str.length() - (2 * count));
          System.out.println("There are " + remainder 
              + " characters incorrectly matched");
        } else {
          System.out.println("Yes! That string is a palindrome!");
        }
        System.out.println();
        System.out.println("Would you like to test another palindrome (y/n)?");
        another = in.nextLine();
      }
    }
  }
}
