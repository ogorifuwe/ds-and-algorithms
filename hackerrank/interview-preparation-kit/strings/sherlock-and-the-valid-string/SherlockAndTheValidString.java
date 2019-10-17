class SherlockAndTheValidString {

  private static void sherlockAndTheValidString(String s) {
  
    /* init hash table  */
    java.util.Hashtable<Character, Integer> freq =
                      new java.util.Hashtable<Character, Integer>();

    for (int i = 0;  i < s.length(); ++i) {
      char c = s.charAt(i);

      if (freq.containsKey(c)) {
        int val = freq.get(c);
        freq.put(c, ++val);
      } else {
        freq.put(c, 1);
      }
    }
      
    //java.util.ArrayList<Integer> list =
    //                new java.util.ArrayList<Integer>();

    int capacity = freq.size();
    int[] arr = new int[capacity];

    java.util.Enumeration<Character> en = freq.keys();
    Integer SENTINEL = 0;
    while (en.hasMoreElements()) {
      Character key = en.nextElement();
      //list.add(freq.get(key));   
      for (int i = 0; i < arr.length; ++i) {
        arr[i] = freq.get(key);
      }
    }

    /*
   for (Integer i : list) {
    System.out.println(i);
   }*/

    int count = 0;
   for (int i = 0; i < arr.length-1; ++i) {
     System.out.println(arr[i]);
    if (arr[i] != arr[i+1]) {
      ++count;
    }
    if (count > 1) {
      System.out.println("NO");
      return;
    }
   }

   System.out.println("YES");
  }

  public static void main(String[] args) {
    String[] str = {"aabbcd", /*"aabbccddeefghi", "abcdefghhgfedecba" */};

    for (String s : str) {
      sherlockAndTheValidString(s);
    }
  }
}
