import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class SockMerchant {

  static void sockMerchant(int n, int[] arr) {
   
    Hashtable<Integer, Integer> freq = new Hashtable<Integer, Integer>();

    for (int i = 0; i < arr.length; ++i) {
      if (freq.containsKey(arr[i])) {
        int val = freq.get(arr[i]);
        ++val;
        freq.put(arr[i], val);
      } else {
        freq.put(arr[i], 1);
      }
    }
    
    /* get keys from hashtable and iterate */
    Enumeration<Integer> en = freq.keys();
    Integer nPairs = 0;
    while(en.hasMoreElements()) {
      Integer key = en.nextElement();
      nPairs += freq.get(key) / 2;
    }
    System.out.println("total pairs of socks : " +nPairs);


    /* using an entry set and a iterator */
    // getting entru set in set
    Set<Entry<Integer, Integer>> entrySet = freq.entrySet();

    // collection iterator
    Iterator<Entry<Integer, Integer>> iterator = entrySet.iterator();
    Integer nPairs2 = 0;
    while(iterator.hasNext()) {
      Entry<Integer, Integer> entry2 = iterator.next();
      nPairs2 +=  entry2.getValue() / 2;
    }
    System.out.println(nPairs2);
  }

  public static void main(String[] args) {
    int n = 9;
    int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};

    sockMerchant(n, arr);
  }
}
