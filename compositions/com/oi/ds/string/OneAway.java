class OneAway {
  
  public static void main(String[] args) {

    boolean res = isOneAway("abcde", "abcd"); System.out.println("res: " + res);
    boolean res1 = isOneAway("abde", "abcde"); System.out.println("res1: " + res1);
    boolean res2 = isOneAway("a", "a"); System.out.println("res2: " + res2);
    boolean res3 = isOneAway("abcdef", "abqdef"); System.out.println("res3: " + res3);
    boolean res4 = isOneAway("abcdef", "abccef"); System.out.println("res4: " + res4);
    boolean res5 = isOneAway("abcdef", "abcde"); System.out.println("res5: " + res5);
    boolean res6 = isOneAway("aaa", "abc"); System.out.println("res6: " + res6);
    boolean res7 = isOneAway("abcde", "abc"); System.out.println("res7: " + res7);
    boolean res8 = isOneAway("abc", "abcde"); System.out.println("res8: " + res8);
    boolean res9 = isOneAway("abc", "bbc"); System.out.println("res9: " + res9);
  }

  static boolean isOneAway(String s1, String s2) {
    
    boolean isOneAway = false;
    
    

    return isOneAway;
  }
}
