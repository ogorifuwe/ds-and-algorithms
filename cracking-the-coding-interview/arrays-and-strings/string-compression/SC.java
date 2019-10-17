public class SC {

    public static void main(String[] args) {
        System.out.print(compressString1("aabbbcccccddeeeeee")+"\n");
        System.out.print(compressString2("aabbbcccccddeeeeee")+"\n");
        System.out.print(compressString3("aabbbcccccddeeeeee")+"\n");
    }

    private static String compressString1(String str) {
        String compressedString = "";
        int countConsecutive = 0;
        
        for (int i = 0; i < str.length(); ++i) {
            countConsecutive++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                compressedString += "" + str.charAt(i) + countConsecutive;
                countConsecutive = 0;
            }
        }
        return compressedString.length() <= str.length() ? compressedString : str;
    }

    private static String compressString2(String str) {
        StringBuilder compressedString = new StringBuilder();
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                compressedString.append(str.charAt(i));
                compressedString.append(countConsecutive);
                countConsecutive = 0;
            }
        } 
        return compressedString.length() < str.length() ? compressedString.toString() : str;
    }

    private static String compressString3(String str) {
        int finalLength = countCompression(str);
        if (finalLength >= str.length()) return str;

        StringBuilder compressedString = new StringBuilder(finalLength);
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); ++i) {
            countConsecutive++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                compressedString.append(str.charAt(i));
                compressedString.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressedString.toString();
    }

    private static int countCompression(String str) {
        int compressedLength = 0;
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); ++i) {
            countConsecutive++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                compressedLength += 1 + String.valueOf(countConsecutive).length();
                countConsecutive = 0;
            }
        }
        return compressedLength;
    } 
}
