public class SearchRotatedArray {
    
    public static int search(int[] arr, int x) {
        return search(arr, x, 0, arr.length-1);
    }


    public static int search(int[] arr, int x, int left, int right) {
        int mid = (left + right) / 2;
        if (x == arr[mid]) { // found element
            return mid;
        }

        if (right < left) {
            return -1;
        }

        /* Either the left or right half must be normally ordered.
         * Find out which half is normally ordered and then use the
         * normally ordered half to figure out which side to search
         * to find x */
        if (arr[left] < mid) { // left is normally ordered
            if (x > arr[left] && x < arr[mid]) {
                return search(arr, x, left, mid-1); // search left
            } else {
                return search(arr, x, mid+1, right); // search right
            }
        } else if (arr[mid] < arr[left]) { // right is normally ordered
            if (x > arr[mid] && x <= arr[right]) {
                return search(arr, x, mid+1, right);
            } else {
                return search(arr, x, left, mid);
            }
        } else if (arr[left] == arr[mid]) { // left is either all repeats
            // OR loops around (with the right half being all dups)
            if (arr[mid] != arr[right]) { // if right half is different,
                //search there
                return search(arr, x, mid+1, right);
            } else { // else, we have ro search both halves
                int result = search(arr, x, left, mid-1);
                if (result == -1) {
                    return search(arr, x, mid+1, right);
                } else {
                    return result;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 2, 2, 2, 2, 2, 2, 2};

        System.out.println(search(a, 2));
        System.out.println(search(a, 3));
        System.out.println(search(a, 4));
        System.out.println(search(a, 1));
        System.out.println(search(a, 8));
    }
}
