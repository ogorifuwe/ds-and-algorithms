class Generics {
  
  static <T extends Comparable<T>> T findMax(T a, T b) {
    int n = a.compareTo(b);
    T max = n < 0 ? b : a;
    return max;
  }

  public static void main(String[] args) {
    System.out.println(findMax(2, 3));
    System.out.println(findMax(3, 3));
    System.out.println(findMax(2, 2));

    System.out.println(findMax(2.0, 3.0));
    System.out.println(findMax(3.0, 3.0));
    System.out.println(findMax(2.0, 3.0));
    
    System.out.println(findMax('a', 'b'));
  
    System.out.println(findMax("hello", "there"));

    //Generics k = new Generics();
    //System.out.println(findMax(k, k));
  }

  /*@Override
  public int CompareTo(Object o) {
    throw new UnsupportedOperationException("Not supported yet.");
  }*/
}
