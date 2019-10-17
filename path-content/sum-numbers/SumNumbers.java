/**.
 * Given a string, return the sum of numbers appearing in the string,
 * ignoring all other characters. A number is a series of 1 or more
 * digit chars in a row. (Note: Character.isDigit(char) tests if a
 * char is one of the chars '0', '1', .., '9'. Integer.parseInt(string)
 * converts a string to an int.)
 *
 * sumNumbers("abc123xyz") --:~ 123
 * sumNumbers("aa11bb33")  --:~ 44
 * sumNumbers("7 11")      --:~ 18
 **/
public class SumNumbers {

    static int sumNumbers(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); ++i) {
            if (Character.isDigit(str.charAt(i))) {
                int count = 0;
                for (int j = i; j < str.length(); ++j) {
                    if (Character.isDigit(str.charAt(j))) {
                        count++;
                    } else {
                        break;
                    }
                }
                sum += Integer.parseInt(str.substring(i, i+count));
                i += count;
            }
        }
        return sum;
    }

    static int sumNumbers1(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); ++i) {
            if (Character.isDigit(str.charAt(i))) {
                int j;
                for (j = i+1; j < str.length(); ++j) {
                    if (!Character.isDigit(str.charAt(j))) {
                        break;
                    }
                }
                sum += Integer.parseInt(str.substring(i,j));
                i = j;
            }
        }
        return sum;
    }

    static int sumNumbers2(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); ++i) {
            if (Character.isDigit(str.charAt(i))) {
                int j;
                for (j = i + 1; j < str.length()
                        && Character.isDigit(str.charAt(j)); ++j);
                sum += Integer.parseInt(str.substring(i,j));
                i = j;
            }
        }
        return sum;
    }

    static int sumNumbers3(String str) {
        int sum = 0;
        
        for(int i = 0; i < str.length(); ++i) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.substring(i, i+1));
            }
        }
        return sum;
    }
        
    public static void main(String[] args) {
        String str = "aa11bb33";
        int output = sumNumbers2(str);
        System.out.println(output);
    }

}
