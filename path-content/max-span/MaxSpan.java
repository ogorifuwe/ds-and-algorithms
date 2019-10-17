/**.
 * Consider the leftmost and rightmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two inclu-
 * sive. A single value has a span of 1. Returns the largest span found in the
 * given array. (Efficiency is not a priority.)
 *
 * maxSpan([1, 2, 1, 1, 3]) --:~ 4
 * maxSpan([1, 4, 2, 1, 4, 4]) --:~ 6
 * maxSpan([1, 4, 2, 1, 4, 4, 4]) --:~6
 **/

public class MaxSpan {

    static int maxSpan(int[] arr) {
        int maxCount = 0;   
        if (arr.length > 0) {
            maxCount = 1;
        }

        /* loop through array of integers */
        for (int i = 0; i < arr.length; ++i) {
            for (int j = arr.length-1; j > i; --j) {
                if (arr[j] == arr[i]) {
                    int tmpCount = (j - i + 1);
                    if (tmpCount > maxCount) maxCount = tmpCount;
                    break;
                }
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 3};    // 4 expected
        int maxSpan = maxSpan(arr);
        System.out.print(maxSpan + "\n");
    }
}
