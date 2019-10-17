import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagrams {

    static void sort(String[] arr) {
        HashMapList<String, String> mapList =
                            new HashMapList<String, String>();

        /* group words by anagram */
        for (String s : arr) {
            String key = sortChars(s);
            mapList.put(key, s);
        }

        /* convert hash table to array */
        int index = 0;
        for (String key : mapList.keySet()) {
            ArrayList<String> list = mapList.get(key);
            for (String t : list) {
                arr[index] = t;
                index++;
            }
        }
    }

    static String sortChars(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
