:
public class OA {

    public static void main(String[] args) {
        String str1 = "pale", str2 = "pales";
        System.out.print(isOneEditAway(str1, str2) + "\n");
    }

    private static boolean isOneEditAway(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return isOneEditReplace1(str1, str2);
        } else if (str1.length() + 1 == str2.length()) {
            return isOneEditInsertRemove(str1, str2);
        } else if (str1.length() - 1 == str2.length()) {
            return isOneEditInsertRemove(str1, str2);
        }
        return false;
    }


    private static boolean isOneEditReplace1(String str1, String str2) {
        boolean foundDifference = false;
        for (int i = 0; i < str1.length(); ++i) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    private static boolean isOneEditReplace2(String str1, String str2) {
        int numDifferences = 0;
        for (int i = 0; i < str1.length(); ++i) {
            if (str1.charAt(i) != str2.charAt(i)) {
                numDifferences++;
            }
        }
        return (numDifferences == 1);
    }

    private static boolean isOneEditInsertRemove(String str1, String str2) {
        int idx1 = 0 , idx2 = 0;
        while(idx1 < str1.length() && idx2 < str2.length()) {
            if (str1.charAt(idx1) != str2.charAt(idx2)) {
                if (idx1 != idx2) {
                    return false;
                }
                idx2++;
            } else {
                idx1++;
                idx2++;
            }
        }
        return true;
    } 

}
