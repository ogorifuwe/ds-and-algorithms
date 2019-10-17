import java.util.Arrays;

public class TestAnagramComparator1 {

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "carrot", "ele", "duck",
                        "papel", "tarroc", "cudk", "eel", "lee"};
        System.out.println(stringArrayToString(arr));
        Arrays.sort(arr, new AnagramComparator1());
        System.out.println();
        System.out.println(stringArrayToString(arr));
    }

    static String stringArrayToString(String[] arr) {
        return stringArrayToString(arr, 0, arr.length-1);
    }

    static String stringArrayToString(String[] arr, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; ++i) {
            String val = arr[i];
            sb.append(val + ",");
        }
        return sb.toString();
    }
}
