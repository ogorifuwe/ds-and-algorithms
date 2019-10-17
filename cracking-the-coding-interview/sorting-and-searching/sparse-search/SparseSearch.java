public class SparseSearch {

    public static int search(String[] strings, String str, int first, int last) {
        if (first > last) return -1;

        /* move mid to the middle */
        int mid = (first + last) / 2;

        /* if middle is empty find closest non-empty string */
        if (strings[mid].isEmpty()) {
            int left = mid-1;
            int right = mid+1;
            while (true) {
                if (left < first && right > last) {
                    return -1;
                } else if (right <= last && !strings[right].isEmpty()) {
                    mid = right;
                    break;
                } else if (left >= first && !strings[left].isEmpty()) {
                    mid = left;
                    break;
                }
                right++;
                left--;
            }
        }
        
        /* search for string and recurse if necessary */
        if (str.equals(strings[mid])) { // found string
            return mid;
        } else if (strings[mid].compareTo(str) < 0) { // search right
            return search(strings, str, mid+1, last);
        } else { // search left
            return search(strings, str, first, mid-1);
        }
    }

    static int search(String[] strings, String str) {
        if (strings == null || str == null || str == "") {
            return -1;
        }

        return search(strings, str, 0, strings.length-1);
    }

    public static void main(String[] args) {
        String[] arr = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        int res = search(arr, "ball", 0, arr.length-1);
        System.out.print(res + "\n");
    }
}
