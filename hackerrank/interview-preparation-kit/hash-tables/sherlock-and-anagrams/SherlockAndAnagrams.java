class SherlockAndAnagrams {

  static int sherlockAndAnagram(String s) {
    /* init a hash set and add all substrings in the forward direction into it */
    java.util.HashSet<String> set =
      new java.util.HashSet<String>();
    for (int i = 0; i < s.length(); ++i) {
      for (int j = i+1; j < s.length(); ++j) {
        String str = s.substring(i, j);
        if (str.length() == 2 && isUnique(str)) {
          set.add(str);
        } else if (str.length() != 2) {
          set.add(str);
        } 
      }
    }


    java.util.Iterator<String> it = set.iterator();
    while (it.hasNext()) {
      System.out.print(it.next()+", ");
    }
    System.out.print("\n");
    
    /* init a count variable */
    int count = -1;
    
    /* loop through the hash table checking if the substring in one is 
     * contained in the other, increment count where there's a match */
    for (int i = s.length()-1; i > 0; --i) {
      for (int j = i-1; j >= 0; --j) {
        String str = s.substring(i, j);
        if (str.length() == 2 && isUnique(str)) {
          if (set.contains(str)) { ++count; } 
        } else if (str.length() != 2 && set.contains(str)) { 
            ++count;
        }
      }
    }
    
    /* return count */
    return count;
  }

  /* utility method: checks that the string has more thaan 1 unique character */
  static boolean isUnique(String s) {
    boolean unique = s.charAt(0) != s.charAt(1) ? true : false;
    return unique;
  }

  public static void main(String[] args) {
    //String s = "abba";
    String s = "abcd";
    int res = sherlockAndAnagram(s);
    System.out.println(res);
  }
}
