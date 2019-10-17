public class Solution {

  public static void main(String[] args) {
    
    java.util.Scanner stdIn = new java.util.Scanner(System.in);

    int actualDay = stdIn.nextInt(), actualMonth = stdIn.nextInt(), actualYear = stdIn.nextInt();
    int expectedDay = stdIn.nextInt(), expectedMonth = stdIn.nextInt(), expectedYear = stdIn.nextInt();

    stdIn.close();

    int yearsLate = actualYear - expectedYear;
    int monthsLate = actualMonth - expectedMonth; 
    int daysLate = actualDay - expectedDay;
 
    System.out.println((yearsLate > 0) ? 10000 : monthsLate > 0 ? 500 * monthsLate : daysLate > 0 ? 15 * daysLate : 0);
  }
}
