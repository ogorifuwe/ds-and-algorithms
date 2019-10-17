import java.util.Arrays;

public class TestAnagramComparator2 {

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "carrot", "ele", "duck",
                        "papel", "tarroc", "cudk", "eel", "lee"};
        System.out.println(stringArrayToString(arr));
        Arrays.sort(arr, new AnagramComparator2());
        System.out.println();
        System.out.println(stringArrayToString(arr));
    }

    /**.
     * overloaded method, see other method for implementation details
     * @pre string array is non-null
     * @post converts string array to string format
     * @param arr is the string to be converted to array
     * @return the string version of the string array
     **/
    static String stringArrayToString(String[] arr) {
        return stringArrayToString(arr, 0, arr.length-1);
    }

    /**. see above comments for details **/
    static String stringArrayToString(String[] arr, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; ++i) {
            String val = arr[i];
            sb.append(val + ", ");
        }
        return sb.toString();
    }
}
