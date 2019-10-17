import java.util.ArrayList;

public class FlipBitToWin {
    
    /**. 
     * finds the longest sequence of 1s in n 
     * and returns the count.
     **/
    private int longestSequence(int num) {
        if (num == -1) return Integer.BYTES * 8;

        ArrayList<Integer> sequences = getAlternatingSequences(num);
        return findLongestSequence(sequences);
    }

    /**.
     * Returns a list of sizes of the sequences. The sequences starts
     * off with the number of 0s (which might be 0) and then alternates
     * with the counts of each value.
     **/
    private static ArrayList<Integer> getAlternatingSequences(int num) {
        ArrayList<Integer> sequences = new ArrayList<Integer>();
        int searchingFor = 0;
        int counter = 0;

        for (int i = 0; i < Integer.BYTES * 8; ++i) {
            if ((num & 1) != searchingFor) {
                sequences.add(counter);
                searchingFor = num & 1; // flip 1 to 0 or 0 to 1
                counter = 0;
            }
            counter++;
            num >>>= 1;
        }
        sequences.add(counter);

        return sequences;
    }

    /**.
     * Given the lengths of alternating sequences of 0s and 1s,
     * find the longest one we can build.
     **/
    private static int findLongestSequence(ArrayList<Integer> sequences) {
        int maxSeq = 1;

        for (int i = 0; i < sequences.size(); i += 2) {
            int zerosSeq = sequences.get(i);
            int onesSeqRight = i - 1 >= 0 ? sequences.get(i - 1) : 0;
            int onesSeqLeft = i + 1 < sequences.size() ? sequences.get(i + 1) : 0;

            int thisSeq = 0;
            if (zerosSeq == 1) { // can merge
                thisSeq = onesSeqLeft + 1 + onesSeqRight;
            }

            if (zerosSeq > 1) { // just add a zero to either side
                thisSeq = 1 + Math.max(onesSeqRight, onesSeqLeft);
            } else if (zerosSeq == 0) { // no zero, but take either side
                thisSeq = Math.max(onesSeqRight, onesSeqLeft);
            }
            maxSeq = Math.max(thisSeq, maxSeq);
        }

        return maxSeq;
    }

    public static void main(String[] args) {
        System.out.print(findLongestSequence(getAlternatingSequences(1775))+"\n");
        System.out.print("\n");
    }
    


    /**. helps convert int value to its binary representation */
    private String toFullBinaryString(int num) {
        String str = "";
        for (int i = 0; i < 31; ++i) {
            Integer lsb = new Integer(num & 1);
            str = lsb.toString() + str;
            num = num >> 1;
        }
        return str;
    } 
}
