import java.util.Comparator;
import java.util.Arrays;

public class AnagramComparator2 implements Comparator<String> {
    
    private String sortChars(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public int compare(String str1, String str2) {
        return sortChars(str1).compareTo(sortChars(str2));
    }
}
