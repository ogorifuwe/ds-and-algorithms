class SubstringCalculator {

  static int substringCalculator(String s) {

    java.util.Set<String> set = new java.util.HashSet<String>();

    int len = s.length();
    int count = 0;
    for (int i = 0; i < len; ++i) {
      for (int j = i+1; j < len; ++j) {
        String str = s.substring(i);
        ++count;
        System.out.println(count+"\t"+str);
        set.add(str);
      }

      /*for (int k = i+1; k < len; ++k) {
        String str1 = s.substring(i, k);
        ++count;
        System.out.println(count+"\t"+str1);
        set.add(str1);
      }*/
    }


    /*int count1 = 0;
    for (int i = len-1; i > 0; --i) {
      for (int j = i-1; j > 0; --j) {
        String str = s.substring(j, i);
        ++count;
        System.out.println(count1+"\t"+str);
      }*/
    
    int count2 = 0;
    for (int i = 0; i < len; ++i) {
      String str = s.substring(i, i+1);
      count2++;
      System.out.println(count2+"\t"+str);
      set.add(str);
    }

    System.out.println(set.size());

    return count;
  }

  public static void main(String[] args) {
    String s = "kincenvizh";
    //String s = "abcde";
    int res = substringCalculator(s);
    System.out.println(res);
  }
}
