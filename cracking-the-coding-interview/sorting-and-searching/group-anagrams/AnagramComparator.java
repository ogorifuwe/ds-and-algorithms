import java.util.Comparator;
import java.util.Arrays;

public class AnagramComparator implements Comparator<String> {
    
    private String sortChars(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public int compare(String s1, String s2) {
        return sortChars(s1).compareTo(sortChars(s2));
    }
}
