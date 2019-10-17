public class SC1 {

    public static void main(String[] args) {
        System.out.print(compressString3("aabcccccaaa")+"\n");
        System.out.print(compressString3("abca")+"\n");
    }
    /* csv: compressed string version
     * ccc: consecutive character count */
    private static String compressString1(String str) {
        String csv = "";
        int ccc = 0;

        for (int i = 0; i < str.length(); ++i) {
            ccc++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                csv += "" + str.charAt(i) + ccc;
                ccc = 0;
            }
        }
        return csv.length() < str.length() ? csv : str;
    }


    private static String compressString2(String str) {
        StringBuilder csv = new StringBuilder();
        int ccc = 0;

        for (int i = 0; i < str.length(); ++i) {
            ccc++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                csv.append(str.charAt(i));
                csv.append(ccc);
                ccc = 0;
            }
        }
        return csv.length() < str.length() ? csv.toString() : str;
    }


    private static String compressString3(String str) {
        int initCapacity = countCompressions(str);
        int ccc = 0;
        if (initCapacity >= str.length()) { return str; }

        StringBuilder csv = new StringBuilder(initCapacity);
        for (int i = 0; i < str.length(); ++i) {
            ccc++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                csv.append(str.charAt(i));
                csv.append(ccc);
                ccc = 0;
            }
        }
        return csv.toString();
    }

    /* csl: compressed string length */
    private static int countCompressions(String str) {
        int csl = 0;
        int ccc = 0;
        for (int i = 0; i < str.length(); ++i) {
            ccc++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                csl += 1 + String.valueOf(ccc).length();
                ccc = 0;
            }
        }
        return csl;
    }

}
