public class PermPalindrome {

    public static void main(String[] args) {
        //System.out.print(Character.getNumericValue('A')+"\n");
        //System.out.print(Character.getNumericValue('Z')+"\n");
        //System.out.print(getCharNumber('b')+"\n");
        String str = "How are you doing? ";
        //System.out.print(java.util.Arrays.toString(buildFrequencyTable(str))+"\n");
        System.out.print(isPermutationOfPalindrome1(str)+"\n");
        System.out.print(isPermutationOfPalindrome2(str)+"\n");
    }

    private static boolean isPermutationOfPalindrome1(String phrase) {
        int[] table = buildFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    private static boolean checkMaxOneOdd(int[] freqTable) { 
        boolean foundOdd = false;
        for (int count : freqTable) {
            if ((count % 2) == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    private static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    } 

    /**. Builds a frequency table for characters between a - z */
    private static int[] buildFrequencyTable(String phrase) {
        int[] freqTable = new int[Character.getNumericValue('z')-
                                    Character.getNumericValue('a') + 1];
        /* iterate through characters to count occurence */
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                freqTable[x]++;
            }
        }
        return freqTable;
    }

    private static boolean isPermutationOfPalindrome2(String phrase) {
        int countOdd = 0;
        int[] freqTable = new int[Character.getNumericValue('z') -
                                    Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                freqTable[x]++;
                if ((freqTable[x] % 2) == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }
}
